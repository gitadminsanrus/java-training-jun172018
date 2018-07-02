
public class IfStatementDemo {

	public static void main(String[] args) {
		
		/*
		 *  if,
		 *  
		 *  x >= 0 and x < 10, then print "x is small"
		 *  x >= 10 and x < 100, then print "x is medium"
		 *  x >= 100 and x < 1000, then print "x is large"
		 *  x >= 1000, then print "x is extra large"
		 *  x < 0, then print "x is invalid" 
		 * 
		 */
		
		double x = -5.99999993373;
		
		if (x > 0)
			System.out.println("x => " + x);
			x++;//=> This is not part of the if statement.

		
		System.out.println(x);
		
		if (x >= 0 && x < 10)
		{
			System.out.println("x is small");
			
			int y = 10;
			if (y > 0)
			{
				int z = 5;
				if (z > 0)
				{
					
				}
				else if (z > 2)
				{
					
				}
				else 
				{
					
				}
			}
			else 
			{
				
			}
			
//			System.out.println(z);
		}
		else if (x >= 10 && x < 100)
		{
			System.out.println("x is medium");
			
//			System.out.println(y);
			int x1 = 10;
			if (x1 > 5)
			{
				
			}
		}
		else if (x >= 100 && x < 1000)
		{
			System.out.println("x is large");
		}
		else if (x >= 1000)
		{
			System.out.println("x is extra large");
		}
		else 
		{
			System.out.println("x is invalid");
		}
		
		
		//Alternate way:
		if (x >= 1000)
		{
			System.out.println("x is extra large");
		}
		else if (x >= 100)
		{
			System.out.println("x is large");
		}
		else if (x >= 10)
		{
			System.out.println("x is medium");			
		}
		else if (x >= 0)
		{
			System.out.println("x is small");
		}
		else 
		{
			System.out.println("x is invalid");
		}
		
		
		

	}

}
