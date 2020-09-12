package _05_typing_tutor;

import java.awt.Color;
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
	
	}
	
	static JLabel label = new JLabel();
	static JPanel panel = new JPanel();
	
	public void type() {
		JFrame frame = new JFrame();
		currentLetter = generateRandomLetter();
		
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(400,200));
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter + "");
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);

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
		char letter = e.getKeyChar();
		
		System.out.println("you typed: " + letter);
		if(letter==currentLetter) {
		System.out.println("correct");
		panel.setBackground(Color.green);
		}
		else {
		panel.setBackground(Color.red);
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		currentLetter=generateRandomLetter();
		label.setText(currentLetter + "");
		
		
		
	}

}
