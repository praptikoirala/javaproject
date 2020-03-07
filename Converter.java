import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
class Converter extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3;
	JTextField t1,t2;
	JButton b0,b1,b2,b3,b4,b5,b6;
	Converter(){
		setSize(400,400);
		l=new JLabel("CURRENCY CONVERTER");
		l.setBounds(120,10,150,60);
		l3=new JLabel("u");
		l3.setBounds(600,610,80,10);
		l1=new JLabel("NepaleseRupees");
		l1.setBounds(50,75,150,20);
		l2=new JLabel("ConvertedCurrency");
		l2.setBounds(215,75,150,20);
		t1=new JTextField("");
		t1.setBounds(50,95,120,30);
		t2=new JTextField("");
		t2.setBounds(215,95,120,30);
		b0=new JButton("INDIAN");
		b0.setBounds(70,200,125,30);
		b1=new JButton("DOLLAR");
		b1.setBounds(195,200,125,30);
		b2=new JButton("EURO");
		b2.setBounds(70,250,125,30);
		b3=new JButton("POUND");
		b3.setBounds(195,250,125,30);
		b4=new JButton("DIRHAM");
		b4.setBounds(70,300,125,30);
		b5=new JButton("KUWAITI DINAR");
		b5.setBounds(195,300,125,30);
		b6=new JButton("RESET");
		b6.setBounds(145,145,90,30);
		add(l);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(l3);
		setVisible(true);
		setLayout(null);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(t1.getText());
		double b=0.0;
		if(e.getSource()==b0){
			b=a*0.63;
		}
		if(e.getSource()==b1){
			b=a*0.00854;
		}
		if(e.getSource()==b2){
			b=a*0.00767;
		}
		if(e.getSource()==b3){
			b=a*0.00666;
		}
		if(e.getSource()==b4){
			b=a*0.3136;
		}
		if(e.getSource()==b5){
			b=a*0.00261;
		}
		String res=String.valueOf(b);
		t2.setText(res);
		if(e.getSource()==b6){
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String[] args){
		Menu m = new Menu();
	}


}