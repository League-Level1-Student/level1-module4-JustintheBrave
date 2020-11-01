package _12_slot_machine;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label1 = new JLabel();
	static JLabel label2 = new JLabel();
	static JLabel label3 = new JLabel();
	
	public void GUI() {
		frame.setVisible(true);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel);
		frame.pack();
	}
	
	
	
}
