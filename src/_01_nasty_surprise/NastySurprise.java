package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NastySurprise surprise = new NastySurprise();
		surprise.TrickOrTreat();
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	static JButton buttonn = new JButton();
	
	
	public void TrickOrTreat() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(buttonn);
		buttonn.setText("Trick");
		button.setText("Treat");
		button.addActionListener(this);
		buttonn.addActionListener(this);
		frame.pack();
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonn) {
		showPictureFromTheInternet("https://i.pinimg.com/originals/1d/7e/36/1d7e36d6356c9a7b8d762fcce8f7049e.jpg");
		}
		
		else if(e.getSource()==button) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/YX-KY1tPjfY/sddefault_live.jpg");
			}
		
	}
}
