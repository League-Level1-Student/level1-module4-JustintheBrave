package _12_slot_machine;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label1;
	static JLabel label2;
	static JLabel label3;
	static JButton button = new JButton();
	
	public void GUI() {
		frame.setVisible(true);
		frame.setTitle("Slot Machine");
		frame.setPreferredSize(new Dimension (450, 200));
		button.setText("SPIN TO WIN");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		frame.add(panel);
		frame.pack();
	}
	
	public void slots() {
		Random ran = new Random();
		int chance1 = ran.nextInt(3);
		int chance2 = ran.nextInt(3);
		int chance3 = ran.nextInt(3);
		
		
		if(chance1==1) {
			try {
				label1 = createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance1==2) {
			try {
				label2 = createLabelImage("bar.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance1==3) {
			try {
				label3 = createLabelImage("7.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance2==1) {
			try {
				label1 = createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance2==2) {
			try {
				label2 = createLabelImage("bar.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance2==3) {
			try {
				label3 = createLabelImage("7.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance3==1) {
			try {
				label1 = createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance3==2) {
			try {
				label2 = createLabelImage("bar.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance3==3) {
			try {
				label3 = createLabelImage("7.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	

}