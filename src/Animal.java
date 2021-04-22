
/**
 * @author tylercambron
 *
 */
public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	public Animal() {
		setSimID(1);
		setLocation(new Location(0, 0));
		setFull(false);
		setRested(true);
	}
	
	public Animal(int simID, Location location) {
		setSimID(simID);
		setLocation(location);
		setFull(false);
		setRested(true);
	}
	
	public void eat() {
		double randNum = Math.random();
		if (randNum > 0.5) {
			this.full = true;
		} else {
			this.full = false;
		}
	}
	
	public void sleep() {
		double randNum = Math.random();
		if (randNum > 0.5) {
			this.rested = true;
		} else {
			this.rested = false;
		}
	}
	
	public int getSimID() {
		return this.simID;
	}
	
	public void setSimID(int simID) {
		if (simID < 0) {
			throw new InvalidSimIDException();
		}
		this.simID = simID;
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public boolean isFull() {
		return this.full;
	}
	
	public void setFull(boolean full) {
		this.full = full;
	}
	
	public boolean isRested() {
		return this.rested;
	}
	
	public void setRested(boolean rested) {
		this.rested = rested;
	}
}
