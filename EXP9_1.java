/**
 * 
 */
package oppsjava;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;




/**
 * @author Soham
 *
 */
class Salslip {
    private JTable jt,jt1;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l17,
    l15,l16;
    float hra,da,ta,gross,gpf,tax,net;
   
    int x,y;
    JFrame f1;    
	Salslip(float bp,String nme,String des,String ph){
		f1=new JFrame();
        Random r=new Random();
        x=r.nextInt(12);
        y=r.nextInt(1000);
        
        calculate(bp);
        
		String rows[][]= {{"Basic",Float.toString(bp),"GPF",Float.toString(gpf)},{"HRA",Float.toString(hra),"TAX",String.valueOf(tax)},{"TA",String.valueOf(ta),"",""},{"DA",Float.toString(da),"",""},
				{"","","","",},{"Total Addition",Float.toString(gross),"TOTAL DEDUCTION",Float.toString(gpf+tax)},
				{"","","",""},{"","","NET SALARY",Float.toString(net)}};
		String [][]col= {{"Earnings","Amount","Deduction","Amount"}};
		String []col1= {"","","",""};
		String month[]= {"januvary","Februry","March","April","May","June","July","August","September","October","November","December"};
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(1000,1000);
		f1.getContentPane().setBackground(Color.lightGray);
		
		jt=new JTable(rows,col1);
		jt.setFont(new Font("col0",Font.BOLD,12));
		jt.setBounds(50,451,800,130);
	    f1.add(jt);
	     
	    jt1=new JTable(col,col1);
	    jt1.setFont(new Font("row0",Font.BOLD,12));
	    jt1.setBounds(50,439,800,12);
	    jt1.setBackground(Color.CYAN);
	    f1.add(jt1);
	    
	    l1=new JLabel("GEC TECHNOLOGIES");
	    l1.setBounds(370,10,300,60);
	    l1.setFont(new Font("",Font.BOLD,25));
	    f1.add(l1);
	    
	    l2=new JLabel("Pharmagudi ponda-Goa");
	    l2.setBounds(428,35,300,60);
	    l2.setFont(new Font(Font.SERIF,Font.PLAIN,13));
	    f1.add(l2);
	   
	    l3=new JLabel("Employee Name");
	    l3.setBounds(150,150,200,40);
	    l3.setFont(new Font("",Font.BOLD,14));
	    f1.add(l3);

	    l4=new JLabel("Designation");
	    l4.setBounds(150,200,200,40);
	    l4.setFont(new Font("",Font.BOLD,14));
	    f1.add(l4);
	   
	    l5=new JLabel("Phone no");
	    l5.setBounds(150,260,200,40);
	    l5.setFont(new Font("",Font.BOLD,14));
	    f1.add(l5);
	   
	    l6=new JLabel("Month");
	    l6.setBounds(150,310,200,40);
	    l6.setFont(new Font("",Font.BOLD,14));
	    f1.add(l6);
	    
	    l7=new JLabel("Salary Slip");
	    l7.setBounds(410,70,200,50);
	    l7.setFont(new Font(Font.MONOSPACED,Font.ITALIC|Font.BOLD,25));
	    f1.add(l7);
	    
	    l12=new JLabel("Chaque No:");
	    l12.setBounds(50,580,200,40);
	    l12.setFont(new Font("chaque no",Font.BOLD,14));
	    f1.add(l12);
	    
	    l13=new JLabel("Signature of Employee");
	    l13.setBounds(50,700,300,40);
	    l13.setFont(new Font("Signature",Font.BOLD,14));
	    f1.add(l13);
	    
	    l14=new JLabel("Signature of Employee");
	    l14.setBounds(650,700,300,40);
	    l14.setFont(new Font("Signature",Font.BOLD,14));
	    f1.add(l14);
	    
	    l16=new JLabel("Date:");
	    l16.setBounds(670,580,100,40);
	    l16.setFont(new Font("Date",Font.BOLD,14));
	    f1.add(l16);
	    
	    LocalDate m=LocalDate.now();
	    DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    l17=new JLabel(String.valueOf(d.format(m)));
	    l17.setBounds(730,580,100,40);
	    f1.add(l17);
	    
	    l8=new JLabel();
	    l8.setBounds(400,150,200,40);
	    l8.setText(nme);
	    f1.add(l8);
	    
	    l9=new JLabel();
	    l9.setBounds(400,200,200,40);
	    l9.setText(des);
	    f1.add(l9);
	    
	    l10=new JLabel();
	    l10.setBounds(400,260,200,40);
	    l10.setText(ph);
	    f1.add(l10);
	  
	    l11=new JLabel();
	    l11.setBounds(400,310,200,40);
	    l11.setText(month[x]);
	    f1.add(l11);
	    
	    l15=new JLabel();
	    l15.setBounds(140,580,100,40);
	    l15.setText(String.valueOf(y));
	    f1.add(l15);  	
	}
	public void calculate(float bp) {
		 da=0.34f*bp;
	     hra=0.18f*(da+bp);
		 ta=3600+(0.34f*3600);
	     gross=bp+da+hra+ta;
		 gpf=0.1f*gross;
		 tax=0.2f*gross;
		 net=gross-(gpf+tax);		    	   
	}	
}
public class EXP9_1 implements ActionListener{
	public JFrame f;
	public JPanel jp;
	private JLabel l1,l2,l3,l4,l5;
	public JTextField tf1,tf2,tf3,tf4;
	public JButton B1,B2;
	
  EXP9_1(){
	 f=new JFrame();
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setSize(1000,1000);
	 f.setTitle("PAY SLIP");
	 f.getContentPane().setBackground(Color.lightGray);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 l1= new JLabel("PAY SLIP");
	 l1.setFont(new Font("PAY SLIP",Font.BOLD,25));
	 l1.setBounds(400,20,150,50);
	 l1.setForeground(Color.black);
	 f.getContentPane().add(l1);
	
	 l2=new JLabel("Employee Name");
     l2.setBounds(100,100,200,50);
     l2.setForeground(Color.black);
	 l2.setFont(new Font("Emplyee Name",Font.BOLD,15));
	 f.getContentPane().add(l2);
	 
	 l3=new JLabel("Employee Designation");
     l3.setBounds(100,200,250,50);
     l3.setForeground(Color.black);
	 l3.setFont(new Font("Emplyee Name",Font.BOLD,15));
	 f.getContentPane().add(l3);
	 
	 l4=new JLabel("Employee Ph No");
     l4.setBounds(100,300,300,50);
     l4.setForeground(Color.black);
	 l4.setFont(new Font("Emplyee Name",Font.BOLD,15));
	 f.getContentPane().add(l4);
	 
	 l5=new JLabel("Employee Basic Salary");
     l5.setBounds(100,400,300,50);
     l5.setForeground(Color.black);
	 l5.setFont(new Font("Emplyee Name",Font.BOLD,15));
	 f.getContentPane().add(l5);
	 
	 tf1=new JTextField();
	 tf1.setBounds(450,100,250,50);
	 f.getContentPane().add(tf1);
	 
	 tf2=new JTextField();
	 tf2.setBounds(450,200,250,50);
	 f.getContentPane().add(tf2);
	 
	 tf3=new JTextField();
	 tf3.setBounds(450,300,250,50);
	 f.add(tf3);
	 
	 tf4=new JTextField();
	 tf4.setBounds(450,400,250,50);
	 f.getContentPane().add(tf4);
	 
	 B1=new JButton("GENERATE");
	 B1.setBounds(400,600,200,50);
	 B1.setFont(new Font("GENERATE",Font.BOLD,15));
	 f.getContentPane().add(B1);
	 
	 B2=new JButton("RESET");
	 B2.setBounds(150,600,200,50);
	 B2.setFont(new Font("RESET",Font.BOLD,15));
	 f.getContentPane().add(B2);
	 
	 B1.addActionListener(this);
	 B2.addActionListener(this);
	 
  }
	 public void actionPerformed(ActionEvent e) {
			if(e.getSource()==B1) {
			
				String nme=tf1.getText();
				String des=tf2.getText();
				String ph=tf3.getText();
				String basic=tf4.getText();
			    float bp=Float.parseFloat(basic);
				
				Salslip S= new Salslip(bp,nme,des,ph);
			}
			else {
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
			}
		}
	public static void main(String[] args) {
	EXP9_1 e=new EXP9_1();
	}

}
