package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinRunner implements ActionListener {
	
	static PigLatinTranslator lang = new PigLatinTranslator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PigLatinRunner pig = new PigLatinRunner();
		pig.CreateUI();
		
		
	}
	static JTextField text = new JTextField();
	static JButton button = new JButton();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	
	public void CreateUI() {
		panel.add(text);
		panel.add(button);
		panel.add(label);
		button.setText("Translate");
		button.addActionListener(this);
		text.setPreferredSize(new Dimension(100,25));
		
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String translation = lang.translate(text.getText());
		label.setText(translation);
		frame.pack();
	}
	
	

}
