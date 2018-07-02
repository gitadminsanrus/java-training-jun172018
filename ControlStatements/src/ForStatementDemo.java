
public class ForStatementDemo {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 10; x++)
		{
			System.out.println("x = " + x);
		}
		
		int[] values = {10, 20, 30, 40, 50, 60};
		for (int index = 0; index < values.length; index++)
		{
			int eachValue = values[index];
			System.out.println("values[" + index + "] => " + eachValue);
		}
		
		
//		System.out.println(index);
		
		//for-each loop
		for (int value : values)
		{
			System.out.println(value);
		}
		
		//conversion of for loop to equivalent while loop
		int x = 0;
		while (x < 10)
		{
			System.out.println("x is " + x);
			
			x++;
		}
		
		x = 0;
		while(x < 10)
		{
			
		}

	}

}
