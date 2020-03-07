import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
class Menu extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JButton b1,b2;
	Menu(){
		setSize(400,400);
		l1=new JLabel("WELCOME");
		l1.setBounds(155,30,80,50);
		l2=new JLabel("Select a program");
		l2.setBounds(135,115,100,50);
		l3=new JLabel("");
		l3.setBounds(600,610,80,50);
		b1=new JButton("CALCULATOR");
		b1.setBounds(100,170,180,50);
		b2=new JButton("CURRENCY-CONVERTER");
		b2.setBounds(100,240,180,50);
		add(b1);
		add(b2);
		add(l1);
		add(l2);
		add(l3);
		setVisible(true);
		setLayout(null);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			Calculator c=new Calculator();
		}
		if(e.getSource()==b2){
			Converter c1=new Converter();
		}
	}
	public static void main(String[] args){
		new Menu();
	}
}