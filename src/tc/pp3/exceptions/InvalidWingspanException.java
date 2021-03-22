package tc.pp3.exceptions;

/**
 * @author tylercambron
 *
 */
public class InvalidWingspanException extends RuntimeException {
	public InvalidWingspanException() {
		System.out.println("Invalid Wingspan, should be between (5.0-11.0)");
	}
}
