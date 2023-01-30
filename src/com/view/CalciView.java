//1
package com.view;
import javax.swing.*;
import com.controller.CalciController;
public class CalciView extends JFrame
{
	
	public JLabel l1,l2,l3,l4;
	public JButton b1,b2,b3,b4,b5,b6;
	public JTextField tf1,tf2,tf3;
	public CalciView()
	{
		l1=new JLabel("First no:");
		tf1=new JTextField();
		l2=new JLabel("Second no:");
		tf2=new JTextField();
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		l3=new JLabel("Result:");
		tf3=new JTextField();
		b5=new JButton("Reset");
		b6=new JButton("Cancel");
		l4=new JLabel();
		
		l1.setBounds(40,10,100,40);
		tf1.setBounds(150,10,100,40);
		l2.setBounds(40,60,100,40);
		tf2.setBounds(150,60,100,40);
		b1.setBounds(20,120,70,40);
		b2.setBounds(100,120,70,40);
		b3.setBounds(180,120,70,40);
		b4.setBounds(260,120,70,40);
		l3.setBounds(40,170,70,40);
		tf3.setBounds(150,170,100,40);
		b5.setBounds(60,230,100,40);
		b6.setBounds(170,230,100,40);
		
		b1.addActionListener(new CalciController(this));
		b2.addActionListener(new CalciController(this));
		b3.addActionListener(new CalciController(this));
		b4.addActionListener(new CalciController(this));
		b5.addActionListener(new CalciController(this));
		b6.addActionListener(new CalciController(this));
		
		add(l1);	add(tf1);
		add(l2);	add(tf2);
		add(b1);	add(b2);	add(b3);	add(b4);
		add(l3);	add(tf3);
		add(b5);	add(b6);
		add(l4);
		
		setSize(500,500);
		setTitle("Calculator");
		setVisible(true);
		setLayout(null);
	}
}

