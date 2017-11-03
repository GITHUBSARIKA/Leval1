package l1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	ColorTeacher ct = new ColorTeacher();

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton buttonyellow = new JButton();
		JButton buttonred = new JButton();
		JButton buttonblue = new JButton();
		JButton buttongreen = new JButton();
		frame.add(panel);
		panel.add(buttonyellow);
		panel.add(buttonred);
		panel.add(buttonblue);
		panel.add(buttongreen);
		buttonyellow.addActionListener(null);
		buttonred.addActionListener(null);
		buttonblue.addActionListener(null);
		buttonblue.addActionListener(null);

		buttonyellow.setBackground(Color.YELLOW);
		buttonyellow.setOpaque(true);

		buttonred.setBackground(Color.RED);
		buttonred.setOpaque(true);

		buttonblue.setBackground(Color.BLUE);
		buttonblue.setOpaque(true);

		buttongreen.setBackground(Color.GREEN);
		buttongreen.setOpaque(true);

		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        
	}
}
