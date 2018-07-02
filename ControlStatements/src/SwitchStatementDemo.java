
public class SwitchStatementDemo 
{

	public static void main(String[] args) 
	{
		
		int x = 15;
		
		switch(x)
		{
			default:
				System.out.println("x is invalid.");
				break;
			
			case 1:
			case 5:
				System.out.println("This case handles for x = 1 and 5.");
				
				int y = 10;
				if (y > 10)
				{
					int z = 0;
					switch(z)
					{
						case 10:
							System.out.println("");
							break;
					}
				}
				else 
				{
					
				}
				break;
				
//			case 5:
//				System.out.println("x is 5");
				
			case 0:
				System.out.println("x is 0");
				break;
				
			
			
		}

		System.out.println("After switch");
		
		
		//conversion of switch statement to equivalent if statement
		if (x == 1 || x == 5)
		{
			System.out.println("This case handles for x = 1 and 5.");			
		}
		else if (x == 0)
		{
			System.out.println("x is 0");
		}
		else 
		{
			System.out.println("x is invalid.");
		}
		
		char input = 'A';
		switch (input)
		{
			case 'A':
				//option entered by user is 'A' and do things accordingly
				break;
				
			case 'B':
				break;
				
			default:
				System.out.println("Invalid input. Please try again.");
		}
		
		if (input == 'A') 
		{
			
		}
		else if (input == 'B')
		{
			
		}
		else 
		{
			
		}
	}

}
