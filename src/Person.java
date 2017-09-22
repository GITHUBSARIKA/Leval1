
public class Person {
	private String name;
	private int age;
	static int counter;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		counter++;
	}

	String name() {
		return name;

	}

	int age() {
		return age;

	}

	static int counter() {
		return counter;

	}

}
