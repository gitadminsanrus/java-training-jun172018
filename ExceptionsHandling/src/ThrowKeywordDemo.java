
public class ThrowKeywordDemo {

	public static void main(String[] args) {
		
		try {
			UserLogin login = new UserLogin("user123", null);
			System.out.println("valid login form");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		

		System.out.println("end of main() method");
	}

}
