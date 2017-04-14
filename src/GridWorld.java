import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug bugg = new Bug();
		Location location = new Location(2, 2);
		Location locationn = new Location(2, 7);
		world.add(location, bug);
		world.add(location, bugg);

	}
}
