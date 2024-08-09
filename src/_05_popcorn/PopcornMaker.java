package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String popFlavor = JOptionPane.showInputDialog("What flavor do you want you popcorn to be?");
	String time = JOptionPane.showInputDialog("How long do you want your popcorn to be cooked?\n(In minutes)");
	int timeInt = Integer.parseInt(time);
	Popcorn popcorn = new Popcorn(popFlavor);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(timeInt);
	String microwavestart = JOptionPane.showInputDialog("Start microwave?");
	if (microwavestart.equals("yes")) {
		microwave.startMicrowave();
	}
	else if (microwavestart.equals("no")) {
		JOptionPane.showMessageDialog(null, "Party pooper");
	}
	else {
		JOptionPane.showMessageDialog(null, "ERROR_MICROWAVE_START_FAIL");
	}
	String eatPopcorn = JOptionPane.showInputDialog("Eat your popcorn?");
	if (eatPopcorn.equals("yes")) {
		popcorn.eat();
	}
	else {
		JOptionPane.showMessageDialog(null, "You have decided to not eat you popcorn");
	}
}
}
