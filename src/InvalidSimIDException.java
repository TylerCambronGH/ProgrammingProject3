
/**
 * @author tylercambron
 *
 */
public class InvalidSimIDException extends RuntimeException {
	public InvalidSimIDException() {
		System.out.println("Sim ID must be greater than zero.");
	}
}
