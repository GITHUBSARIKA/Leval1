
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		int number = new Random(4).nextInt(4);
		System.out.println(number);
		JOptionPane.showInputDialog("Enter a question for the Magic8Ball");
		if (number == 0) {
			JOptionPane.showMessageDialog(null, "YES!!!!!!!");
		} else if (number == 1) {
			JOptionPane.showMessageDialog(null, "NO!!!!!!!!");
		} else if (number == 2) {
			JOptionPane.showMessageDialog(null, "Mabye you should ask goooogle!!!!!");
		} else if (number == 3) {
			JOptionPane.showMessageDialog(null, "Just forget about it.");
		}
		// 3. Print out this variable

		// 4. Get the user to enter a question for the 8 ball

		// 5. If the random number is 0

		// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer
	}
}
