
public class MultiCatchDemo {

	public static void main(String[] args) {
		
		int values[] = {10, 20};
		Object obj = null;
		
		try 
		{
			if (obj != null) {
				obj.toString();
			}
			
			int index = 10;
			if (index < values.length) {
				int value = values[index];
				System.out.println("value=" + value);
			}
			
			
			int a = 10;
			int b = 0;
			int c = a / b;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			try
			{
				
			}
			catch(Exception e1)
			{
				
			}
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		
		System.out.println("end of main() method.");

	}

}
