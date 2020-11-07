package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	static Date date;
	
	public static void main(String args[]) {
		WhackAMole mole = new WhackAMole();
		mole.GUI();
		date = new Date();
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static int moleHits = 0;
	static Random ran = new Random();
	static int moleNum;
	
	public void GUI() {
		frame.setTitle("Whack a Mole");
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension (250, 300));
		frame.pack();
		drawButtons();
	}
		
	
	public void drawButtons() {
		moleNum = ran.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if(i==moleNum) {
				button.setText("Mole!");
			}
			panel.add(button);
			button.addActionListener(this);
		}
	}
	
    static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
    
    private void endGame(Date timeAtStart, int molesWhacked) { 
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                      + " moles per second.");
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(! buttonPressed.getText().equalsIgnoreCase("Mole!")) {
			speak("ur bad");	
	}
		if(buttonPressed.getText().equalsIgnoreCase("Mole!")) {
			moleHits++;	
	}
		if(moleHits==10) {
			endGame(date, 10);
			frame.dispose();
		}
		frame.dispose();
		moleNum = ran.nextInt(24);
		GUI();
	}
}
