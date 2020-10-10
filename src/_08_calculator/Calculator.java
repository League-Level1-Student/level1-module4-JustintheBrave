package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	public void add() {
		String num1 = text1.getText();
		String num2 = text2.getText();
		int uno = Integer.parseInt(num1);
		int dos = Integer.parseInt(num2);
		ans.setText(uno + dos + "");
	}
	
	public void sub() {
		String num1 = text1.getText();
		String num2 = text2.getText();
		int uno = Integer.parseInt(num1);
		int dos = Integer.parseInt(num2);
		ans.setText(uno - dos + "");
	}
	
	public void mul() {
		String num1 = text1.getText();
		String num2 = text2.getText();
		int uno = Integer.parseInt(num1);
		int dos = Integer.parseInt(num2);
		ans.setText(uno * dos + "");
	}
	
	public void div() {
		String num1 = text1.getText();
		String num2 = text2.getText();
		int uno = Integer.parseInt(num1);
		int dos = Integer.parseInt(num2);
		ans.setText(uno / dos + "");
	}
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField text1 = new JTextField();
	static JTextField text2 = new JTextField();
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();
	static JButton button4 = new JButton();
	static JTextField ans = new JTextField();
	
	public void display() {

		frame.setVisible(true);
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.setTitle("Justin's Amazing Calculator");
		panel.add(ans);
	
		//size
		frame.setPreferredSize(new Dimension(225,300));
		button1.setPreferredSize(new Dimension(100,100));
		button2.setPreferredSize(new Dimension(100,100));
		button3.setPreferredSize(new Dimension(100,100));
		button4.setPreferredSize(new Dimension(100,100));
		text1.setPreferredSize(new Dimension(100,25));
		text2.setPreferredSize(new Dimension(100,25));
		ans.setPreferredSize(new Dimension(200,25));
		
		//text
		button1.setText("add");
		button2.setText("sub");
		button3.setText("mul");
		button4.setText("div");
		
		//Action listeners
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		
		
		
		frame.pack();
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			add();
		}
		if(e.getSource()==button2) {
			sub();
		}
		if(e.getSource()==button3) {
			mul();
		}
		if(e.getSource()==button4) {
			div();
		}
		
	}
}
