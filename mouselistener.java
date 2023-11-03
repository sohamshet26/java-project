import java.awt.*;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.colorchooser.*;
import java.io.*;
import java.time.*;


public class mouselistener  implements MouseListener,MouseMotionListener,ActionListener {
	String fonts[]= {"Italic","Center Baseline","plain","Roman BaseLine","Hanging BaseLine","Type_1"};
	public JFrame f;
	public JMenuBar m;
	public JMenu m1,m2;
	public JPanel paintpanel;
	public JMenuItem item1,item2,item3,item4;
	public ImageIcon saveicon,saveicon2,saveasicon, newicon,abouticon,writeicon,openicon,pencilicon,eraseicon,shape1icon,shape2icon,shape3icon,
	shape4icon,shape5icon,shape6icon;
	public JButton b1,redb,greenb,whiteb,blueb,goldb,pinkb,orangeb,brownb,blackb,lightgrayb,grayb,yellowb,cyanb,mageentab,darkgrayb,
	indigob,navyb,coralb,bisqueb,b2,erasebutton,pencilbutton,b3,Colour,shape1,shape2,shape3,shape4,shape5;
	public JLabel fontLabel,colorlabel,date,pointer;
	private JSlider sl;
	public JTextField ta;
	public JComboBox cb;
    public Object o;
    private Graphics g;
	mouselistener(){
		
		f=new JFrame();
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(0, 0,2000,2000);
		
		m=new JMenuBar();
		f.add(m);
		m1=new JMenu("File");
		m2=new JMenu("view");
		
	    m.add(m1);
	    m.add(m2);
	   
	    sl=new JSlider(JSlider.HORIZONTAL,0,100,50);
        sl.setMajorTickSpacing(20);
		sl.setPaintTicks(true);
		sl.setPaintLabels(true);
	    sl.setBounds(350,20,150,50);
	    
	    b2=new JButton("save");
	    b2.setBackground(Color.white);
	    m.add(b2);
	    saveicon2=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-save-40.png");
		b2.setIcon(saveicon2);
		
		b3=new JButton("save as");
		b3.setBackground(Color.white);
		saveasicon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\Save-as-icon.png");
		m.add(b3);
		b3.setIcon(saveasicon);
		
		erasebutton=new JButton();
		erasebutton.setBounds(550,10,40,40);
		eraseicon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-eraser-40.png");
		erasebutton.setBackground(Color.white);
		erasebutton.setIcon(eraseicon);
		erasebutton.addActionListener(this);
		
		pencilbutton=new JButton();
		pencilbutton.setBounds(550,60,40,40);
		pencilicon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-pencil-drawing-40.png");
		pencilbutton.setBackground(Color.white);
	    pencilbutton.setIcon(pencilicon);
	    pencilbutton.addActionListener(this);
	    
	    Colour=new JButton("Colour Ckeck");
	    Colour.setBounds(220,100,150,30);
	    Colour.addActionListener(this);
	    
	    shape1=new JButton();
	    shape1.setBounds(610,10,40,40);
	    shape1icon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-rectangle-30.png");
	    shape1.setIcon(shape1icon);
	    shape1.setBackground(Color.white);
	    shape1.addActionListener(this);
	    
	    shape2=new JButton();
	    shape2.setBounds(660,10,40,40);
	    shape2icon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-circled-30.png");
	    shape2.setIcon(shape2icon);
	    shape2.setBackground(Color.white);
	    shape2.addActionListener(this);
	    
	    shape3=new JButton();
	    shape3.setBounds(710,10,40,40);
	    shape3icon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-triangle-30.png");
	    shape3.setIcon(shape3icon);
	    shape3.setBackground(Color.white);
	    shape3.addActionListener(this);
	    
	    shape4=new JButton();
	    shape4.setBounds(760,10,40,40);
	    shape4icon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-line-30.png");
	    shape4.setIcon(shape4icon);
	    shape4.setBackground(Color.white);
	    shape4.addActionListener(this);
	    
	    shape5=new JButton();
	    shape5.setBounds(610,60,40,40);
	    shape5icon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\right-triangle (1).png");
	    shape5.setIcon(shape5icon);
	    shape5.setBackground(Color.gray);
	    shape5.addActionListener(this);
	    
	    date=new JLabel("Date : "+LocalDate.now());
	    date.setBounds(50,660,100,50);
	    
	    pointer=new JLabel();
	    pointer.setBounds(200,660,200,50);
	    
	    item1=new JMenuItem("  New");
	    newicon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-new-file-50.png");
	    item1.setIcon(newicon);
	    
	    item2=new JMenuItem(" open");
	    openicon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-open-file-under-cursor-50.png");
	    item2.setIcon(openicon);
	    item2.addActionListener(this);
	    
	    item3=new JMenuItem("  About Paint");
	    abouticon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\icons8-about-40.png");
	    item3.setIcon(abouticon);
	    item3.addActionListener(this);
	    
	    item4=new JMenuItem(" StyleBar");
	    item4.addActionListener(this);
	    
	    b1=new JButton();
	    b1.setBounds(10,30,60,50);
	    b1.setBackground(Color.white);
	    writeicon=new ImageIcon("C:\\Users\\Soham\\eclipse-workspace\\introduction\\src\\font-symbol-of-letter-a.png");
	    b1.setIcon(writeicon);
	     
	    redb=new JButton();
	    redb.setBackground(Color.red);
	    redb.setBounds(220,20,20,20);
	    redb.addActionListener(this);
	    
	    greenb=new JButton();
	    greenb.setBackground(Color.green);
	    greenb.setBounds(240,20,20,20);
	    greenb.addActionListener(this);
	    
	    
	    whiteb=new JButton();
	    whiteb.setBackground(Color.white);
	    whiteb.setBounds(260,20,20,20);
	    whiteb.addActionListener(this);
	    
	    blueb=new JButton();
	    blueb.setBackground(Color.blue);
	    blueb.setBounds(280,20,20,20);
	    blueb.addActionListener(this);
	    
	    pinkb=new JButton();
	    pinkb.setBackground(Color.pink);
	    pinkb.setBounds(300,20,20,20);
	    pinkb.addActionListener(this);
	    
	    orangeb=new JButton();
	    orangeb.setBackground(Color.orange);
	    orangeb.setBounds(220,40,20,20);
	    orangeb.addActionListener(this);
	    
	    blackb=new JButton();
	    blackb.setBackground(Color.black);
	    blackb.setBounds(240,40,20,20);
	    blackb.addActionListener(this);
	    
	    lightgrayb=new JButton();
	    lightgrayb.setBackground(Color.lightGray);
	    lightgrayb.setBounds(260,40,20,20);
	    lightgrayb.addActionListener(this);
	    
	    grayb=new JButton();
	    grayb.setBackground(Color.gray);
	    grayb.setBounds(280,40,20,20);
	    grayb.addActionListener(this);
	    
	    yellowb=new JButton();
	    yellowb.setBackground(Color.yellow);
	    yellowb.setBounds(300,40,20,20);
	    yellowb.addActionListener(this);
	    
	    cyanb=new JButton();
	    cyanb.setBackground(Color.cyan);
	    cyanb.setBounds(220,60,20,20);
	    cyanb.addActionListener(this);
	    
	    mageentab=new JButton();
	    mageentab.setBackground(Color.magenta);
	    mageentab.setBounds(240,60,20,20);
	    mageentab.addActionListener(this);
	    
	    darkgrayb=new JButton();
	    darkgrayb.setBounds(260,60,20,20);
	    darkgrayb.setBackground(Color.darkGray);
	    darkgrayb.addActionListener(this);
	    
	    indigob=new JButton();
	    indigob.setBackground(new Color(75,0,130));
	    indigob.setBounds(280,60,20,20);
	    indigob.addActionListener(this);
	    
	    brownb=new JButton();
	    brownb.setBackground(new Color(165,42,42));
	    brownb.setBounds(300,60,20,20);
	    brownb.addActionListener(this);
	    
	    navyb=new JButton();
		navyb.setBackground(new Color(0,0,128));
		navyb.setBounds(320,20,20,20);
		navyb.addActionListener(this);
	
		coralb=new JButton();
		coralb.setBackground(new Color(255,127,80));
		coralb.setBounds(320,40,20,20);
		coralb.addActionListener(this);
		
		bisqueb=new JButton();
		bisqueb.setBackground(new Color(255,228,196));
		bisqueb.setBounds(320,60,20,20);
		bisqueb.addActionListener(this);
		
	    cb=new JComboBox(fonts);
		cb.setBounds(100,30,110,50);
		cb.addActionListener(this);
		
		fontLabel=new JLabel();
		fontLabel.setText("Font Style");
		fontLabel.setBounds(100,10,70,25);
		
		colorlabel=new JLabel("Colours");
		colorlabel.setBounds(250,1,70,25);
		
	    b1.addActionListener(this);
	    item1.addActionListener(this);
	    item2.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    
	    m1.add(item1);
	    m1.add(item2);
	    m1.add(item3);
	    m2.add(item4);
	   
	    f.setJMenuBar(m);
	    		
		item1.setMnemonic(KeyEvent.VK_N);
		item2.setMnemonic(KeyEvent.VK_O);
		item3.setMnemonic(KeyEvent.VK_S);
		item4.setMnemonic(KeyEvent.VK_A);
	}
	
	public void actionPerformed(ActionEvent e) {
		o=e.getSource();
		if(e.getSource()==item1) {
			//adding A button
			f.add(b1);
			
			//adding Colour button
			f.add(Colour);
			
			//adding pencil and eraser
			f.add(erasebutton);
			f.add(pencilbutton);
			
			//adding slider
			f.add(sl);
		    f.setBackground(Color.gray);
			
			//adding colourbuttons
			f.add(redb);f.add(greenb);f.add(whiteb);f.add(blueb);f.add(pinkb);f.add(orangeb);f.add(blackb);f.add(lightgrayb);f.add(grayb);;
			f.add(yellowb);f.add(mageentab);f.add(cyanb);f.add(darkgrayb);f.add(coralb);f.add(bisqueb);f.add(indigob);f.add(navyb);f.add(brownb);
			
			//adding paint panel
			paintpanel=new JPanel();
			paintpanel.setBounds(110,150,1300,500);	
			paintpanel.setBackground(Color.white);
			f.add(paintpanel);
			
			//adding shapes
			f.add(shape1);
			f.add(shape2);
			f.add(shape3);
			f.add(shape4);
			f.add(shape5);
			
			f.add(cb);
			f.add(fontLabel);
			f.add(colorlabel);
		}
		
		else
		if(e.getSource()==b1) {		
			ta=new JTextField();
			paintpanel.addMouseListener(this);	
		}
		//Colours events
		else 
		if(e.getSource()==redb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.red);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==greenb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.green);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==whiteb||e.getSource()==erasebutton) {
			g=paintpanel.getGraphics();
			g.setColor(Color.white);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==blueb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.blue);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==pinkb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.pink);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==orangeb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.orange);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==blackb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.black);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==lightgrayb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.lightGray);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==grayb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.gray);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==yellowb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.yellow);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==cyanb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.cyan);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==mageentab) {
			g=paintpanel.getGraphics();
			g.setColor(Color.magenta);
			paintpanel.addMouseMotionListener(this);
		}
		else if(e.getSource()==darkgrayb) {
			g=paintpanel.getGraphics();
			g.setColor(Color.darkGray);
			paintpanel.addMouseMotionListener(this);
		}
       else if(e.getSource()==indigob) {
    	   g=paintpanel.getGraphics();
    	   g.setColor(new Color(75,0,130));
			paintpanel.addMouseMotionListener(this);
		}
       else if(e.getSource()==brownb) {
    	   g=paintpanel.getGraphics();
    	   g.setColor(new Color(164,42,42));
			paintpanel.addMouseMotionListener(this);
		}
       else if(e.getSource()==navyb) {
    	   g=paintpanel.getGraphics();
    	   g.setColor(new Color(0,0,128));
			paintpanel.addMouseMotionListener(this);
       }
       else if(e.getSource()==coralb) {
    	   g=paintpanel.getGraphics();
    	   g.setColor(new Color(255,127,80));
			paintpanel.addMouseMotionListener(this);
      }
       else if(e.getSource()==bisqueb) {
    	   g=paintpanel.getGraphics();
    	    g.setColor(new Color(255,228,196));
			paintpanel.addMouseMotionListener(this);
		}
		
		
		String p;
		//saving as jpg file
		if(e.getSource()==b3) {
			
			JFileChooser file=new JFileChooser();
			int response=file.showSaveDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File path=file.getSelectedFile();
	             p=path.getAbsolutePath();
			
			try {
			Robot r=new Robot();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle Rect = new Rectangle(110,240,1300,500);
			BufferedImage Image = r.createScreenCapture(Rect);
			ImageIO.write(Image,"jpg", new File(p));
			JOptionPane.showMessageDialog(f,"Succsessfully Saved");
			}catch(Exception ex) {
			  JOptionPane.showMessageDialog(f,"ERROR OCCURED","Warning",JOptionPane.WARNING_MESSAGE);
			}
		}
				
		}
		//opening a file
		else
		if(e.getSource()==item2) {
			JFileChooser file=new JFileChooser();
			int response=file.showOpenDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File path=file.getSelectedFile();
	             p=path.getAbsolutePath();
	             try {
	             BufferedImage img=null;
	             img=ImageIO.read(new File(p));
	            JLabel pic=new JLabel(new ImageIcon(img));
	             paintpanel.add(pic);
	             }catch(Exception ex) {
	            	 JOptionPane.showMessageDialog(f,"ERROR OCCURED","Warning",JOptionPane.WARNING_MESSAGE);
	             }
			}
		}
		else if(e.getSource()==item3){
			JOptionPane.showMessageDialog(f,"Design by Soham And Saurabh"+"\nAll Rights Reserved");
		}
		else if(e.getSource()==Colour) {
			  Color c=JColorChooser.showDialog(f,"Choose",Color.CYAN); 
			  g.setColor(c);
		}
		else if(e.getSource()==item4) {
			f.add(date);
			f.addMouseMotionListener(this);
			
		}
		else if(e.getSource()==pencilbutton){
			paintpanel.addMouseMotionListener(this);
		}
		
		if(e.getSource()==shape1 ||e.getSource()==shape2||e.getSource()==shape3||e.getSource()==shape4||e.getSource()==shape5) {
			paintpanel.addMouseListener(this);
		}
		
		if(e.getSource()==cb) {
			String fo=(String) cb.getSelectedItem();
		   if(fo=="Italic") {
			   ta.setFont(new Font("italic",Font.ITALIC,sl.getValue()));
		   }
		   else if(fo=="Center Baseline") {
			   ta.setFont(new Font("italic",Font.CENTER_BASELINE,sl.getValue()));
		   }
		   else if(fo=="plain") {
			   ta.setFont(new Font("italic",Font.PLAIN,sl.getValue()));
		   }
		   else if(fo=="Roman Baseline") {
			   ta.setFont(new Font("italic",Font.ROMAN_BASELINE,sl.getValue()));
		   }
		   else if(fo=="Hanging Baseline") {
			   ta.setFont(new Font("italic",Font.HANGING_BASELINE,sl.getValue()));
		   }
		   else if(fo=="Type_1") {
			   ta.setFont(new Font("italic",Font.TYPE1_FONT,sl.getValue()));
		   }
		}
	
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		   if(pencilbutton==o) {
			   g.setColor(Color.black);
			   g.fillOval(e.getX(),e.getY(),3,3);
		   }
		   else if(o==item4) {
			   String xCor=String.valueOf(e.getX());
			   String yCor=String.valueOf(e.getY());
			   pointer.setText("X ="+xCor+" Y ="+yCor);
			   f.add(pointer);
		   }
		   else {
	    	g.fillOval(e.getX(),e.getY(), sl.getValue(),sl.getValue());	
		   }
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
	
	public static void main(String arg[]) {
		mouselistener m=new mouselistener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		g.setColor(Color.black);
		if(o==shape1) {
			g.drawRect(e.getX(),e.getY(),sl.getValue(),sl.getValue());
		}
		else if(o==shape2) {
			g.drawOval(e.getX(),e.getY(),sl.getValue(),sl.getValue());
		}
		else if(o==shape3) {
			int x[]={e.getX(),e.getX()-sl.getValue(),e.getX()+sl.getValue()};
			int y[]= {e.getY(),e.getY()+sl.getValue(),e.getY()+sl.getValue()};
			
			g.drawPolygon(x, y, 3);
		}
		else if(o==shape4) {
			g.drawLine(e.getX(),e.getY(),e.getX()+50,+e.getY()+sl.getValue());
		}
		else if(o==shape5) {
			int x[]= {e.getX(),e.getX(),e.getX()+sl.getValue()};
			int y[]= {e.getY(),e.getY()+sl.getValue(),e.getY()+sl.getValue()};
			g.drawPolygon(x, y, 3);
			
		}
		else {
		ta.setBounds(e.getX(),e.getY(),sl.getValue(),sl.getValue());
		paintpanel.add(ta);
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
