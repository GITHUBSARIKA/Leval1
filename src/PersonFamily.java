
public class PersonFamily {
	PersonFamily family = new PersonFamily();

	public static void main(String[] args) {
		Person person1 = new Person("Manisha", 39);
		Person person2 = new Person("Sunil", 42);
		Person person3 = new Person("Radhika", 9);
		Person person4 = new Person("Sarika", 11);

		System.out.println(person1.name() + " is my name " + person1.age() + " is my age ");
		System.out.println(person2.name() + " is my name " + person2.age() + " is my age ");
		System.out.println(person3.name() + " is my name " + person3.age() + " is my age ");
		System.out.println(person4.name() + " is my name " + person4.age() + " is my age ");
		System.out.println(person4.counter() + " people in my family ");

	}
}
