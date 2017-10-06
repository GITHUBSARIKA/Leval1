
public class Rocket {
	int fuel;
	String name;

	public Rocket(int fuel, String name) {
		System.out.println("Constructing rocket...");
		this.fuel = fuel;
		this.name = name;
	}

	void launch() {
		for (int i = 0; i < fuel; fuel--) {
			System.out.println(fuel);
		}

		if (fuel == 0) {
			System.out.println("OUT OF FUEL");
		}
	}

}
