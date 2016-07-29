import org.teachingextensions.logo.Tortoise;

public class Houses1 {
	public static void main(String[] args) {
		Tortoise.setX(50);
		Tortoise.setY(375);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawHouse(300);		
		drawHouse(200);
		drawHouse(100);
		drawHouse(50);
		drawHouse(25);
		drawHouse(10);
		drawHouse(5);
		

	}

	public static void drawHouse(int height) {

		for (int i = 0; i < 3; i++) {
			Tortoise.move(height);
			Tortoise.turn(90);
		}
		for (int h = 0; h < 2; h++) {
			Tortoise.turn(90);
		}
		Tortoise.move(50);
       Tortoise.turn(-90);
	}
}
