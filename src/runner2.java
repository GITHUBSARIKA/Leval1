
public class runner2 {
	public static void main(String[] args) {
		creatures2 bob = new creatures2("spongebob");
		creatures2 patrick = new creatures2("patrick");
		creatures2 squidward = new creatures2("squidward");
		bob.eat();
		bob.laugh();
		patrick.eat();
		squidward.eat();
		patrick.laugh();
		squidward.laugh();
		System.out.println("Patrick");
		System.out.println("squidward");
	}

}
