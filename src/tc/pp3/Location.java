package tc.pp3;

import tc.pp3.exceptions.InvalidCoordinateException;

/**
 * @author tylercambron
 *
 */

public class Location {
	protected int xCoord, yCoord;
	
	public Location() {
		update(0, 0);
	}
	
	public Location(int x, int y) {
		update(x, y);
	}
	
	public void update(int x, int y) {
		if (x < 0 || y < 0) {
			throw new InvalidCoordinateException();
		}
		
		xCoord = x;
		yCoord = y;
	}
	
	public int[] getCoordinates() {
		int[] coords = {xCoord, yCoord};
		return coords;
	}
}
