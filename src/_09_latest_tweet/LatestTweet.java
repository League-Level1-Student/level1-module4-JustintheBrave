package _09_latest_tweet;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	static JTextField text = new JTextField();
	
	public void display() {
		frame.setVisible(true);
		panel.add(text);
		text.setPreferredSize(new Dimension(100,25));
		panel.add(button);
		button.setText("Tweet Retriever");
		frame.add(panel);
		button.addActionListener(this);
		
		
		
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Tweet, tweet");
		}
	}
}
