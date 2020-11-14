package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label1 = new JLabel();
	static JLabel label2 = new JLabel();
	static JLabel label3 = new JLabel();
	static JButton button = new JButton();
	
	public void GUI() {
		frame.setVisible(true);
		frame.setTitle("Slot Machine");
		frame.setPreferredSize(new Dimension (600, 160));
		button.setText("SPIN TO WIN");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		label1.setPreferredSize(new Dimension (150,150));
		label2.setPreferredSize(new Dimension (150,150));
		label3.setPreferredSize(new Dimension (150,150));
		panel.add(button);
		button.addActionListener(this);
		frame.add(panel);
		frame.pack();
		
		slots();
	}
	
	public void slots() {
	  
		Random ran = new Random();
		int chance1 = ran.nextInt(3);
		int chance2 = ran.nextInt(3);
		int chance3 = ran.nextInt(3);
		
		if(chance1==0) {
			try {
				panel.remove(label1);
				label1 = createLabelImage("Cherry.jpg");
				label1.setPreferredSize(new Dimension (150,150));
				panel.add(label1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance1==1) {
			try {
				panel.remove(label1);
				label1 = createLabelImage("bar.png");
				label1.setPreferredSize(new Dimension (150,150));
				panel.add(label1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance1==2) {
			try {
				panel.remove(label1);
				label1 = createLabelImage("7.png");
				label1.setPreferredSize(new Dimension (150,150));
				panel.add(label1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance2==0) {
			try {
				panel.remove(label2);
				label2 = createLabelImage("Cherry.jpg");
				label2.setPreferredSize(new Dimension (150,150));
				panel.add(label2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance2==1) {
			try {
				panel.remove(label2);
				label2 = createLabelImage("bar.png");
				label2.setPreferredSize(new Dimension (150,150));
				panel.add(label2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance2==2) {
			try {
				panel.remove(label2);
				label2 = createLabelImage("7.png");
				label2.setPreferredSize(new Dimension (150,150));
				panel.add(label2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance3==0) {
			try {
				panel.remove(label3);
				label3 = createLabelImage("Cherry.jpg");
				label3.setPreferredSize(new Dimension (150,150));
				panel.add(label3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance3==1) {
			try {
				panel.remove(label3);
				label3 = createLabelImage("bar.png");
				label3.setPreferredSize(new Dimension (150,150));
				panel.add(label3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(chance3==2) {
			try {
				panel.remove(label3);
				label3 = createLabelImage("7.png");
				label3.setPreferredSize(new Dimension (150,150));
				panel.add(label3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if(chance1==0 && chance2==0 && chance3==0 || chance1==1 && chance2==1 && chance3==1 ||chance1==2 && chance2==2 && chance3==2) {
			JOptionPane.showMessageDialog(null, "WINNER WINNER CHICKEN DINNER");
		}
		
		frame.pack();
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		slots();
	}
	

}