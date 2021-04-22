
/**
 * @author tylercambron
 *
 */
public class InvalidCoordinateException extends RuntimeException {
	public InvalidCoordinateException() {
		System.out.println("Invalid coordinates, x and y must be greater than zero!");
	}
}
