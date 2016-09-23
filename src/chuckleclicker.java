import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	JButton got = new JButton();
	JButton hot = new JButton();

	public static void main(String[] args) {
		chuckleclicker yuo = new chuckleclicker();
		yuo.makeButtons();
	}

	void makeButtons() {
		JOptionPane.showMessageDialog(null, "Hi");
		JFrame dot = new JFrame();
		JPanel cot = new JPanel();
		dot.setVisible(true);
		dot.add(cot);
		cot.add(got);
		cot.add(hot);
		got.addActionListener(this);
		hot.addActionListener(this);
		got.setText("Q");
		hot.setText("A");
		dot.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == got) {
			JOptionPane.showMessageDialog(null, "hi");
			JOptionPane.showMessageDialog(null, "Why did the chicken make lots of mistakes on purpose?");

		}
		if (e.getSource() == hot) {
			JOptionPane.showMessageDialog(null, "hi");
			JOptionPane.showMessageDialog(null,
					"Because his parents said you learn from making mistakes so the chicken\nmade lots of mistakes\nso he will soon be a genious.");
		}
	}
}
