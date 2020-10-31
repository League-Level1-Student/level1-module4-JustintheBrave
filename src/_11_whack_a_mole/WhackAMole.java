package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	public static void main(String args[]) {
		WhackAMole mole = new WhackAMole();
		mole.GUI();
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	public void GUI() {
		System.out.println("test");
		frame.setTitle("Whack a Mole");
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension (250, 300));
		drawButtons();
	}
	
	
	public void drawButtons() {
		Random ran = new Random();
		int moleNum = ran.nextInt(24);
		
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if(i==moleNum) {
				button.setText("Mole!");
			}
			panel.add(button);
			button.addActionListener(this);
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
