import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slotmachine implements MouseListener {
	int num1 = 0;
	int num2 = 1;
	int num3 = 2;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel winlose = new JLabel();

	public static void main(String[] args) {
		Slotmachine slot = new Slotmachine();
	}

	Slotmachine() {
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(spin);
		panel.add(label3);
		panel.add(label2);
		panel.add(label1);
		panel.add(winlose);
		spin.setText("SPIN");
		frame.setVisible(true);
		label1.setText("");
		label2.setText("");
		label3.setText("");
		winlose.setText("you lose");
		spin.addMouseListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// TODO hi my name is hello
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		num1 = new Random().nextInt(3);
		num2 = new Random().nextInt(3);
		num3 = new Random().nextInt(3);
		label1.setText(Integer.toString(num1));
		label2.setText(Integer.toString(num2));
		label3.setText(Integer.toString(num3));
		System.out.println("mouseClicked");
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
