package _08_calculator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	public void add() {
		
	}
	
	public void sub() {
		
	}
	
	public void mul() {
		
	}
	
	public void div() {
		
	}
	
	public void display() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(text1);
		panel.add(text2);
		frame.add(panel);
	
		//arrangement test
		frame.setPreferredSize(new Dimension(500,750));
		button1.setPreferredSize(new Dimension(300,100);
		
		
		
		
		
		
		frame.pack();
	
		
	}
}
