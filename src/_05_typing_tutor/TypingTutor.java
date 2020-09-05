package _05_typing_tutor;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	static char currentLetter;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypingTutor type = new TypingTutor();
		type.type();
		
		currentLetter = generateRandomLetter();
	}
	
	
	public void type() {
		JFrame frame = new JFrame();
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(400,200));
		frame.addKeyListener(this);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter + "hello");
		panel.add(label);
		frame.add(panel);

		frame.pack();
	}
	
	static char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
