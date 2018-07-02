
public class BreakAndContinueStatementDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++)
		{
			for (int j = 0; j < 200; j++) 
			{
				if (j == 100)
				{
					break;
				}				
			}
			
			if (i == 10)
			{
				break;
			}
			
			System.out.println("i => " + i);
		}
		
		System.out.println("After for loop");
		
		
		for (int i = 0; i < 100; i++)
		{
			if (i % 2 != 0)
			{
				continue;
			}
			
			System.out.println("i => " + i);
		}

	}

}
