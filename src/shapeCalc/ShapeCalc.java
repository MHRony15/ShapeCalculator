package shapeCalc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public  class ShapeCalc extends AFrame {

	public ShapeCalc(String title) {
		super(title);
	}
	
	

	
	protected void initialize() {
	
		 JFrame frame1=new JFrame("Shape Calculator");
			frame1.setVisible(true);
			frame1.setSize(400, 400);
			frame1.setLocationRelativeTo(null);
		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel();
		JLabel areaLbl = new JLabel("Area: ");
		JTextField shapeTF = new JTextField("Square");
	    JButton newBtn = new JButton("New...");

		
		Container cp = getContentPane();
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl,BorderLayout.CENTER);
		cp.add(areaLbl,BorderLayout.SOUTH);
		ctrlPnl.add(shapeTF);
	    ctrlPnl.add(newBtn);
	    
	    newBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String aString = shapeTF.getText();
				areaLbl.setText(aString);
			}
		});
		
		
	}
	
}
