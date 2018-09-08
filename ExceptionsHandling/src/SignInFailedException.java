//checked exception, so try-catch block is mandatory
public class SignInFailedException extends Exception {
	
	public SignInFailedException(String message) {
		super(message);
	}

}
