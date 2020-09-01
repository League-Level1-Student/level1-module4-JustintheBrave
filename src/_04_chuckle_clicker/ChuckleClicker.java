package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChuckleClicker CC =  new ChuckleClicker();
		CC.makeButtons();
	}
	
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	
	public void makeButtons() {
		JOptionPane.showMessageDialog(null, "Make Buttons");
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		
		button1.setText("joke");
		button2.setText("punchline");
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "What did one man say to the other");
		}
		else if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "hi");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
