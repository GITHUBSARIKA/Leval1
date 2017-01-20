import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*Make a class, main method and showButton method. Put a printout in the showButton method and challenge kids to get it printing (they will need to instantiate class and call method on the instance). 
	FortuneCookie fortune = new FortuneCookie();
	fortune.showButton();

Make a JFrame in showButton method and get it to show.
jFrame.setVisible(true);

Make a JButton and add it to the JFrame.
JButton butt = new JButton();
jFrame.add(butt);

When the button is clicked, say “Woohoo”.
Add an action listener to the button:jButton.addActionListener(this);
Let your class implement ActionListener [use quick fix]
Add unimplemented methods [use quick fix]
Put JOptionPane pop-up inside actionPerformed() method

Generate a random number between 0 and 4: 
int rand = new Random().nextInt(5);

Depending on which random number, show one of the five fortunes.

Quiz kids (using easy buttons as buzzers) on all of this.
*/
public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();

	}

	void showButton() {
		System.out.println("hello");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(4);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will be poor");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will be rich");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Someone will be stalking you...");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will win a raffle");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "everyone in your math class will shun you");
		}

	}

}
