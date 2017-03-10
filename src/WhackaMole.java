import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole implements MouseListener {
	static JButton molebutton;

	public static void main(String[] args) {
		int numofButtons = 30;
		drawButtons((new Random().nextInt(numofButtons)));

	}

	static void drawButtons(int random) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		for (int i = 0; i < 30; i++) {

			if (i == random) {
				molebutton = new JButton("mole!@#$%^&*()");
			} else {
				JButton button = new JButton();
				panel.add(button);
			}

		}
		frame.setSize(500, 500);
		frame.add(panel);
		frame.setVisible(true);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub TODO
		// I need help
		// if (e.getSource()==JButton button){

		// }
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
