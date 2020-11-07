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
		mole.drawButtons();
		date = new Date();
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static int moleHits = 0;
	static int miss = 0;
	Random ran = new Random();
	
	public void GUI() {
		frame.setTitle("Whack a Mole");
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension (250, 300));
		frame.pack();
	}
		
	
	public void drawButtons() {
		int moleNum = ran.nextInt(24);
		panel.removeAll();
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
			miss++;
			
			WhackAMole mole = new WhackAMole();
			frame.dispose();
			mole.GUI();
			mole.drawButtons();
	}
		
		if(miss==1) {
			speak("dont miss again");
		}
		
		else if(miss==2) {
			speak("ur bad");
		}
		
		else if(miss==3) {
			speak("how are u so bad");
		}
		else if(miss==4) {
			speak("garbage");
		}
		
		else if(miss==5) {
			speak("i give up, you lose");
			System.exit(0);
		}
		
		if(buttonPressed.getText().equalsIgnoreCase("Mole!")) {
			moleHits++;	
			frame.dispose();
			GUI();
			drawButtons();
			
	}
		if(moleHits==10) {
			endGame(date, 10);
			System.exit(0);
		}
	}
}
