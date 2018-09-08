
public class ThrowKeywordDemo {

	public static void main(String[] args) {
		
//		try {
//			
//		} catch (RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
		

		try {
			UserLogin userLogin = new UserLogin("user123", null);
			userLogin.signIn();
		} catch (Exception e) {
			System.out.println("Error message from ThrowKeywordDemo.java");
		}
		System.out.println("valid login form");
		
		System.out.println("end of main() method");
	}

}
