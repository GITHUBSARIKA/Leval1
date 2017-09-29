import java.util.Random;

import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Create a frame & make it visible
		Random random = new Random();
		JFrame frame = new JFrame();

		frame.add(panel);
		frame.setVisible(true);
		panel.setBackgroundImage(galapagosIslands);

		frame.pack();
		for (int i = 0; i < 100; i++) {
			Turtle tortoise = new Turtle();
			panel.addTurtle(tortoise);

			tortoise.moveTo(random.nextInt(1600), random.nextInt(1600));
		}
		// 2. Add the panel to the frame

		// 3. Set the background image of the panel to the Galapagos Islands

		// 4. Instantiate a Turtle

		// 5. Add the turtle to the panel

		// 6. Put 50 Turtles on the beach

	}
}
