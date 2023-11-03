package oppsjava;
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.*;
import java.util.Scanner;

/**
 * @author Soham
 *
 */


import java.util.random.*;
import javax.swing.*;
import java.awt.event.*;

class current{
	JFrame f1=new JFrame();
	Random r=new Random();
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	private JTable jt1,jt2,jt3,jt4;
	int x;double amt;double mc;

	current(String nme,String id,String ph,String d,String previ,String pre,int k){
		x=r.nextInt(999);
		bill(k);
		LocalDate m=LocalDate.now();
		DateTimeFormatter m1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String data[][]= {{"Meter Number","Unit","current date","Current reading",
			"previous date","Previous reading","Consumption","Reading remark"}};
		String row[]= {"","","","","","","",""};
		String data1[][]= {{String.valueOf(x),"KWH",String.valueOf(m1.format(m)),pre,"",previ,String.valueOf(k),"OK"}};
		String par[][]= {{"Energy charges",String.valueOf(amt)},{"Meter Rent",Double.toString(mc)},{"",""},{"Amount Payable",Double.toString(amt+mc)}};
		String par1[]= {"",""};
		String am[][]= {{"Purticulars","Amount"}};
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setTitle("ELECTRICITY DEPARTMENT");
		f1.setSize(1000,1000);
		f1.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		jt1=new JTable(data,row);
		jt1.setBackground(Color.cyan);
		jt1.setFont(new Font(Font.SERIF,Font.BOLD,13));
		jt1.setBounds(30,450,800,18);
		f1.add(jt1);
		
		jt2=new JTable(data1,row);
		jt2.setBackground(Color.yellow);
		jt2.setFont(new Font(Font.SERIF,Font.BOLD,13));
		jt2.setBounds(30,468,800,18);
		f1.add(jt2);
		
		jt3=new JTable(par,par1);
		jt3.setBounds(300,550,300,70);
		f1.add(jt3);
		
		jt4=new JTable(am,par1);
		jt4.setBackground(Color.orange);
		jt4.setFont(new Font(Font.SERIF,Font.BOLD,13));
		jt4.setBounds(300,538,300,12);
		f1.add(jt4);
		
		l1=new JLabel("ELECTRICITY DEPARTMENT - GOVERMENT OF GOA");
		l1.setBounds(90,50,700,50);
		l1.setFont(new Font(Font.SERIF,Font.BOLD,25));
		l1.setForeground(Color.blue);
		f1.add(l1);
		
		l2=new JLabel("Division Div 17 : Mapusa B Sub Division SD2 : Mapusa");
		l2.setBounds(220,80,700,40);
		l2.setFont(new Font(Font.SERIF,Font.BOLD,14));
		l2.setForeground(Color.yellow);
		f1.add(l2);
		
		l3=new JLabel("Consumer Name : ");
		l3.setFont(new Font("name",Font.BOLD,15));
		l3.setBounds(100,170,200,40);
		f1.add(l3);
	
		l4=new JLabel("Consumer ID : ");
		l4.setFont(new Font("ID",Font.BOLD,15));
		l4.setBounds(100,230,200,40);
		f1.add(l4);
		
		l5=new JLabel("Phone NO : ");
		l5.setFont(new Font("phone",Font.BOLD,15));
		l5.setBounds(100,300,200,40);
		f1.add(l5);
		
		l6=new JLabel("Billing Period in days : ");
		l6.setFont(new Font("days",Font.BOLD,15));
		l6.setBounds(100,360,200,40);
		f1.add(l6);
		
		l7=new JLabel();
		l7.setBounds(330,170,200,40);
		l7.setText(nme);
		f1.add(l7);
		
		l8=new JLabel();
		l8.setBounds(330,230,200,40);
		l8.setText(id);
		f1.add(l8);
		
		l9=new JLabel();
		l9.setBounds(330,300,200,40);
		l9.setText(ph);
		f1.add(l9);
		
		l10=new JLabel();
		l10.setBounds(330,360,200,40);
		l10.setText(d);
		f1.add(l10);
		
		l11=new JLabel("Meter Reader sign");
		l11.setBounds(40,700,200,40);
		l11.setFont(new Font("sign",Font.BOLD,13));
		f1.add(l11);
		
		l12=new JLabel("CEE's Sign");
		l12.setBounds(800,700,200,40);
		l12.setFont(new Font("sign",Font.BOLD,13));
		f1.add(l12);
	}
	public void bill(int k) {
		if(k<=100) {
			amt=10*k;
		}
		else if(k<=200){
			amt=10*100;
			amt=amt+15*(k-200);
		}
		else if(k>200) {
			amt=10*100;
			amt=amt+15*100;
			amt=amt+20*(k-200);
		}
		mc =0.15f*amt;	
	}
}

public class EXP9_2 implements ActionListener{
	JFrame f=new JFrame();
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	public JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	public JButton B1,B2;
	
	EXP9_2(){
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(800,800);
		f.setTitle("ELECTRICITY BILL");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		l1=new JLabel("ELECTRICITY BILL");
		l1.setBounds(250,40,400,50);
		l1.setFont(new Font(Font.SANS_SERIF,Font.CENTER_BASELINE|Font.BOLD,35));
		f.add(l1);
		
		l2=new JLabel("Consumer Name");
		l2.setBounds(100,150,200,50);
		l2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
		f.add(l2);
		
		l3=new JLabel("Consumer ID");
		l3.setBounds(100,220,200,50);
		l3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
		f.add(l3);
		
		l4=new JLabel("Phone NO.");
		l4.setBounds(100,290,200,50);
		l4.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
		f.add(l4);
		
		l5=new JLabel("Previous Meter Reading");
		l5.setBounds(100,360,200,50);
		l5.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
		f.add(l5);

		l6=new JLabel("Present Meter Reading");
		l6.setBounds(100,420,200,50);
		l6.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
		f.add(l6);

		l7=new JLabel("Bill Period(in days)");
		l7.setBounds(100,490,200,50);
		l7.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
		f.add(l7);
		
		tf1=new JTextField();
		tf1.setBounds(350,155,300,30);
		f.add(tf1);
		
		tf2=new JTextField();
		tf2.setBounds(350,225,300,30);
		f.add(tf2);
		
		tf3=new JTextField();
		tf3.setBounds(350,295,300,30);
		f.add(tf3);
		
		tf4=new JTextField();
		tf4.setBounds(350,370,300,30);
		f.add(tf4);

		tf5=new JTextField();
		tf5.setBounds(350,430,300,30);
		f.add(tf5);
		
		tf6=new JTextField();
		tf6.setBounds(350,500,300,30);
		f.add(tf6);
		
		B1=new JButton("RESET");
		B1.setBounds(140,600,150,40);
		B1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		f.add(B1);
		
		B2=new JButton("GENERATE");
		B2.setBounds(350,600,150,40);
		B2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		f.add(B2);
		
		B2.addActionListener(this);
		B1.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B2) {
			int k;
			String n=tf1.getText();
			String id=tf2.getText();
			String ph=tf3.getText();
			String previ=tf4.getText();
			String pre=tf5.getText();
			String d=tf6.getText();
			int p1=Integer.parseInt(previ);
			int p2=Integer.parseInt(pre);
			if(p1>p2) {
				k=p1-p2;
			}
			else {
				k=p2-p1;
			}
			current C=new current(n,id,ph,d,previ,pre,k);
		}
	}
	

	public static void main(String[] args) {
		EXP9_2 E=new EXP9_2();

	}

}
