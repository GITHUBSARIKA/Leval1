import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SensitiveKeyBoards implements KeyListener {
	public static void main(String[] args) {
		SensitiveKeyBoards board = new SensitiveKeyBoards();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Press a key");
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(board);
		frame.setVisible(true);
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak("hello hello hello hello hello hello hello hell ohello hello hello hello hello hello helle");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
