
public class TheRunner {
	public static void main(String[] args) {
		SeaCreature34 s = new SeaCreature34("spongebob");
		s.laugh();
		s.eat();
		SeaCreature34 x = new SeaCreature34("Patrick");
		x.eat();
		x.laugh();
		System.out.println(x.getName());
		SeaCreature34 fro = new SeaCreature34("Squidward");
		fro.laugh();
		fro.eat();
		System.out.println(fro.getName());

	}

}