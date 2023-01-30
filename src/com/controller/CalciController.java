//4
package com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.view.CalciView;
import com.model.CalciModel;

public class CalciController implements ActionListener {
	CalciView v;
	CalciModel m;
	public CalciController(CalciView v) {
		super();
		this.v = v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==v.b1)
		{
			int n1=Integer.parseInt(v.tf1.getText());
			int n2=Integer.parseInt(v.tf2.getText());
		    int res=n1+n2;
			v.tf3.setText(Integer.toString(res));
		}
		
		if(e.getSource()==v.b2)
		{
			int n1=Integer.parseInt(v.tf1.getText());
			int n2=Integer.parseInt(v.tf2.getText());
			int res=n1-n2;
			v.tf3.setText(Integer.toString(res));
		}
		
		if(e.getSource()==v.b3)
		{
			int n1=Integer.parseInt(v.tf1.getText());
			int n2=Integer.parseInt(v.tf2.getText());
			int res=n1*n2;
			v.tf3.setText(Integer.toString(res));
		}
		
		if(e.getSource()==v.b4)
		{
			int n1=Integer.parseInt(v.tf1.getText());
			int n2=Integer.parseInt(v.tf2.getText());
			int res=n1/n2;
			v.tf3.setText(Integer.toString(res));
		}
		
		if(e.getSource()==v.b5)
		{
			v.tf1.setText(" ");
			v.tf2.setText(" ");
			v.tf3.setText(" ");
		}
		
		if(e.getSource()==v.b6)
		{
			v.dispose();  //it will close the window
		}
	}
	
}
