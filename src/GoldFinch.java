
/**
 * @author tylercambron
 *
 */
public class GoldFinch extends Animal implements Flyable, Walkable {
	double wingSpan;
	
	public GoldFinch() {
		super();
		setWingspan(9.0);
	}
	
	public GoldFinch(int simID, Location location, double wingSpan) {
		super(simID, location);
		setWingspan(wingSpan);
	}

	public void setWingspan(double wingSpan) {
		if (wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingspanException();
		} else {
			this.wingSpan = wingSpan;
		}
	}
	
	public double getWingspan() {
		return this.wingSpan;
	}

	@Override
	public void walk(int direction) {
		int newX = super.location.getCoordinates()[0];
		int newY = super.location.getCoordinates()[1];
		if (direction % 2 == 0) {
			newX += 1;
		} else {
			newY += 1;
		}
		super.getLocation().update(newX, newY);
	}

	@Override
	public void fly(Location location) {
		super.setLocation(location);
	}
}
