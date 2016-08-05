import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses1 {
	public static void main(String[] args) {
		Tortoise.setX(50);
		Tortoise.setY(375);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawHouse("big","green");
		drawHouse("medium","blue");
		drawHouse("small","red");
	}

	public static void drawHouse(String height, String color) {
		int pixel = 0;

		System.out.println(height);
		if (color.equals("green")) {
			Tortoise.penDown();
			Tortoise.setPenColor(Color.green);
		}
		if (color.equals("blue")) {
			Tortoise.penDown();
			Tortoise.setPenColor(Color.blue);
		}
		if (color.equals("red")) {
			Tortoise.penDown();
			Tortoise.setPenColor(Color.red);
		}
		if (height.equals("big")) {
			pixel = 250;
		}
		if (height.equals("medium")) {
			pixel = 120;
		}
		if (height.equals("small")) {
			pixel = 60;
		}
		for (int i = 0; i < 3; i++) {
			Tortoise.move(pixel);
			Tortoise.turn(90);

		}
		for (int h = 0; h < 2; h++) {
			Tortoise.turn(90);
		}
		Tortoise.move(50);
		Tortoise.turn(-90);

	}
}
