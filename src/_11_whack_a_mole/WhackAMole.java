package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	
	public static void main(String args[]) {
		WhackAMole mole = new WhackAMole();
		mole.GUI();
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	public void GUI() {
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
		}
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
}
