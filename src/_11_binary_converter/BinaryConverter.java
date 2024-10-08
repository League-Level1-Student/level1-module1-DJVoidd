package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JTextField answer = new JTextField(20);
	public static void main (String[] arg0) {
		BinaryConverter binary = new BinaryConverter();
		binary.run();
	}

	public void run() {
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
		frame.setVisible(true);
		button.addActionListener(this);
		button.setText("Answer");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	String convert(String input) {
		if(input.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";//must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";   
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String var = answer.getText();
		label.setText(convert(var));
		frame.pack();
	}
}
