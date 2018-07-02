
public class WhileStatementDemo {

	public static void main(String[] args) {
		
		//x is the loop control expression or variable
		//so x must be properly handled/manipulated to avoid infinite looping.
		int x = 0;
		while (x < 10)
		{
			System.out.println("x = " + x);
			if (x % 2 == 0)
			{
				System.out.println("above x is even number\n");
			}
			x = x + 1;
		}
		
		
		x = 0;
		//a null while statement which has no body in it, and this is will go into infinite looping
		while(x++ < 10000000);
		
		System.out.println("After while loop");

	}

}
