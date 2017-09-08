import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Multitool implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {
		Multitool multitool = new Multitool();
		// TODO
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			int number = new Random().nextInt(100);
			JOptionPane.showMessageDialog(null, "here is a random number " + number);
		} else if (e.getSource() == button2) {
			String name = JOptionPane.showInputDialog("ENTER NAME!!!!!!!!!");
			JOptionPane.showMessageDialog(null, "hi " + name);
		} else if (e.getSource() == button3) {
			String number1 = JOptionPane.showInputDialog("Enter a number");
			String number2 = JOptionPane.showInputDialog("Enter another number");
			int number11 = Integer.parseInt(number1);
			int number22 = Integer.parseInt(number2);
			JOptionPane.showMessageDialog(null, number22 + number11);
		}
	}

	public Multitool() {

		frame.add(panel);
		panel.add(button3);
		panel.add(button2);
		panel.add(button1);
		frame.setVisible(true);
		button1.setText("Random");
		button2.setText("Greetings");
		button3.setText("MATH");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

	}
}
