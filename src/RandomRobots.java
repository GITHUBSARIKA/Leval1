import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RandomRobots {
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(800);
		for (int i = 0; i < 1000; i++) {
			Robot robot = new Robot("mini");

			robot.setRandomPenColor();
			robot.penDown();
			robot.moveTo(random.nextInt(1600), random.nextInt(1600));

		}

	}
}
