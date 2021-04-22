
/**
 * @author tylercambron
 *
 */
public class Application {
	public static void main(String[] args) {
		/*********************************************
		 Location Tests
		*********************************************/
		System.out.println("***************\nLocation Tests\n***************");
		
		Location firstLocation = new Location();
		int[] coords = firstLocation.getCoordinates();
		System.out.println("firstLocation X: " + coords[0] + " Y: " + coords[1]);
		System.out.println("Updating firstLocation");
		firstLocation.update(3, 5);
		coords = firstLocation.getCoordinates();
		System.out.println("firstLocation X: " + coords[0] + " Y: " + coords[1]);

		Location secondLocation = new Location(4, 5);
		coords = secondLocation.getCoordinates();
		System.out.println("secondLocation X: " + coords[0] + " Y: " + coords[1]);
		
		try {
			System.out.println("Attempting to set secondLocation to (-1, 0)");
			secondLocation.update(-1, 0);
		} catch (InvalidCoordinateException e) {
			System.out.println("InvalidCoordinateException caught");
		}

		/*********************************************
		 Animal Tests
		*********************************************/
		System.out.println("***************\nAnimal Tests\n***************");

		Animal randimal = new BrownBear();
		System.out.println("Current simID for randimal: " + randimal.getSimID());
		randimal.setSimID(99);
		System.out.println("New simID for randimal: " + randimal.getSimID());
		randimal.setLocation(secondLocation);
		coords = randimal.getLocation().getCoordinates();
		System.out.println("Set randimal to secondLocation @ X: " + coords[0] + " Y: " + coords[1]);
		while(!randimal.isFull()) {
			System.out.println("Is randimal full? " + randimal.isFull());
			randimal.eat();
			System.out.println("randimal eats.");
		}
		System.out.println("Is randimal full? " + randimal.isFull());
		randimal.setFull(false);		
		System.out.println("Set full to " + randimal.isFull());
		System.out.println("Is randimal rested? " + randimal.isRested());
		randimal.setRested(false);
		System.out.println("Set rested to " + randimal.isRested());
		while (!randimal.isRested()) {
			randimal.sleep();
			System.out.println("randimal sleeps.");
		}
		System.out.println("Is randimal rested? " + randimal.isRested());
		System.out.println("Creating new Animal randimal2 with parameters");
		Animal randimal2 = new GoldFinch(55, new Location(3,6), 5.5);
		try {
			System.out.println("Setting randimal to Sim ID to -4");
			randimal2.setSimID(-4);
		} catch (InvalidSimIDException e) {
			System.out.println("InvalidSimIDException caught.");
		}
		
		/*********************************************
		 Gold Finch Tests
		*********************************************/
		System.out.println("***************\nGoldfinch Tests\n***************");

		System.out.println("creating goldFinch from empty constructor");
		GoldFinch goldFinch = new GoldFinch();
		System.out.println("goldFinch current wingspan: " + goldFinch.getWingspan());
		goldFinch.setWingspan(9.9);
		System.out.println("goldFinch new wingspan: " + goldFinch.getWingspan());
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("goldFinch X: " + coords[0] + " Y: " + coords[1]);
		goldFinch.fly(new Location(8,4));
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("fly goldFinch to X: " + coords[0] + " Y: " + coords[1]);
		goldFinch.walk(1);
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("walk goldFinch towards y: X: " + coords[0] + " Y: " + coords[1]);
		goldFinch.walk(2);
		coords = goldFinch.getLocation().getCoordinates();
		System.out.println("walk goldFinch towards x: X: " + coords[0] + " Y: " + coords[1]);
		System.out.println("creating goldFinch2 from parameter constructor");		
		try {
			System.out.println("Creating goldFinch3 with wingspan 2.0");
			GoldFinch goldFinch3 = new GoldFinch(33, new Location(88,88), 2.0);
		} catch (InvalidWingspanException e) {
			System.out.println("InvalidWingspanException caught");
		}


		/*********************************************
		 BrownBear Tests
		*********************************************/
		System.out.println("***************\nAnimal Tests\n***************");
		
		System.out.println("creating brownBear with empty constructor");
		BrownBear brownBear = new BrownBear();
		System.out.println("brownBear subspecies "+ brownBear.getSubSpecies());
		brownBear.setSubSpecies("Grizzly");
		System.out.println("set brownBear subspecies to "+ brownBear.getSubSpecies());
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear @ X: " + coords[0] + " Y: " + coords[1]);
		brownBear.walk(1);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear walk towards y @ X: " + coords[0] + " Y: " + coords[1]);
		brownBear.walk(2);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear walk towards x @ X: " + coords[0] + " Y: " + coords[1]);
		brownBear.swim(1);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear swim towards y @ X: " + coords[0] + " Y: " + coords[1]);
		brownBear.swim(2);
		coords = brownBear.getLocation().getCoordinates();
		System.out.println("brownBear swim towards x @ X: " + coords[0] + " Y: " + coords[1]);
		System.out.println("creating brownBear2 with parameters");
		BrownBear brownBear2 = new BrownBear(84, new Location(3,4), "Siberian");
		System.out.println("brownBear2 subspecies " + brownBear2.getSubSpecies());
		try {
			System.out.println("Setting brownBear2 to polar");
			brownBear2.setSubSpecies("Polar");
		} catch (InvalidSubspeciesException e) {
			System.out.println("InvalidSubspeciesException caught");
		}
	}
}
