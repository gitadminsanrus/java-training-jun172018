
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		int x = 10;
		
		// ternary operator 
		// (<conditional operation that results into true or false> ? (if true) : (if false) )
		int y = (x > 10) ? x-- : ++x;
		
		System.out.println("x => " + x);
		System.out.println("y => " + y);
		
		
		//'+' operator when used in string, 
		//it will concatenate two or more strings into one string value
		String str = "abc" + " " + "def";
		System.out.println("str => " + str);

	}

}
