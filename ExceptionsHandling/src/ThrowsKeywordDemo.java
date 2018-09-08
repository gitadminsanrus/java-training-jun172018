
public class ThrowsKeywordDemo {

	public static void main(String[] args) {

		try {
			UserLogin userLogin = new UserLogin("user123", null);
			userLogin.signIn();
		} catch (SignInFailedException e) {
			System.out.println("Sign In Failed. Please try again. Reason = " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error message from ThrowsKeywordDemo.java");
		}
		System.out.println("valid login form");

	}

}
