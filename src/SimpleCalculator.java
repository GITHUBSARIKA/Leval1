import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements MouseListener {
	// Create a window with 2 JTextFields and 4 JButtons to function as a simple
	// calculator. Each mathematical function must be contained in its own
	// method. Display the answer as a JLabel.
	static SimpleCalculator calculator = new SimpleCalculator();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton buttonAdd = new JButton();
	static JButton buttonSubtract = new JButton();
	static JButton buttonMultiply = new JButton();
	static JButton buttonDivision = new JButton();
	static JTextField textfields1 = new JTextField("number 1");
	static JTextField textfields2 = new JTextField("number 2");
	static JLabel label = new JLabel("awnser");

	public static void main(String[] args) {

		frame.add(panel);
		panel.add(textfields1);
		panel.add(textfields2);
		panel.add(buttonAdd);
		panel.add(buttonSubtract);
		panel.add(buttonMultiply);
		panel.add(buttonDivision);
		buttonAdd.setText("add");
		buttonSubtract.setText("subtraction");
		buttonMultiply.setText("multiplucation");
		buttonDivision.setText("division");
		buttonAdd.addMouseListener(calculator);
		buttonSubtract.addMouseListener(calculator);
		buttonMultiply.addMouseListener(calculator);
		buttonDivision.addMouseListener(calculator);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == buttonAdd) {
			int number1 = Integer.parseInt(textfields1.getText());
			int number2 = Integer.parseInt(textfields2.getText());
			number1 += number2;
			label.setText(Integer.toString(number1));

		}
		if (e.getSource() == buttonSubtract) {
			int number1 = Integer.parseInt(textfields1.getText());
			int number2 = Integer.parseInt(textfields2.getText());
			number1 -= number2;
			label.setText(Integer.toString(number1));

		}
		if (e.getSource() == buttonMultiply) {
			int number1 = Integer.parseInt(textfields1.getText());
			int number2 = Integer.parseInt(textfields2.getText());
			number1 *= number2;
			label.setText(Integer.toString(number1));

		}
		if (e.getSource() == buttonDivision) {
			int number1 = Integer.parseInt(textfields1.getText());
			int number2 = Integer.parseInt(textfields2.getText());
			number1 /= number2;
			label.setText(Integer.toString(number1));

		}
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
