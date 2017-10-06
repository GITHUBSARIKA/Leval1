import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;

	public TypingTutor() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setName("Type or Die");
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(1000f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.add(label);
		frame.pack();
	}

	// TODO
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
	}

	char generateRandomLetter() {
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
		System.out.println(" you typed: " + e.getKeyChar());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (currentLetter == e.getKeyChar()) {
			System.out.println("CORRECT :) :) :)");
		}
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		frame.pack();
	}

}
