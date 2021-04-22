
import java.util.Arrays;

/**
 * @author tylercambron
 *
 */
public class BrownBear extends Animal implements Walkable, Swimmable {
	final protected String[] SUB_SPECIES = {
			"Alaskan", "Asiatic", "European",
			"Grizzly", "Kodiak", "Siberian"
	};
	
	protected String subSpecies;
	
	public BrownBear() {
		super();
		setSubSpecies("Alaskan");
	}

	public BrownBear(int simID, Location location, String subSpecies) {
		super(simID, location);
		setSubSpecies(subSpecies);
	}
	
	
	public String getSubSpecies() {
		return subSpecies;
	}
	
	public void setSubSpecies(String subSpecies) {
		if (!Arrays.asList(SUB_SPECIES).contains(subSpecies)) {
			throw new InvalidSubspeciesException();
		}
		this.subSpecies = subSpecies;
	}

	@Override
	public void swim(int direction) {
		int newX = super.location.getCoordinates()[0];
		int newY = super.location.getCoordinates()[1];
		if (direction % 2 == 0) {
			newX += 2;
		} else {
			newY += 2;
		}
		super.location.update(newX, newY);
	}

	@Override
	public void walk(int direction) {
		int newX = super.location.getCoordinates()[0];
		int newY = super.location.getCoordinates()[1];
		if (direction % 2 == 0) {
			newX += 3;
		} else {
			newY += 3;
		}
		super.location.update(newX, newY);
		
	}
}
