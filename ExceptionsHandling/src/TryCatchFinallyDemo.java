
public class TryCatchFinallyDemo {

	public static void main(String[] args) {

		int[] values = {10, 20, 30, 40, 50};
		
		try
		{
			int value = values[10];	
			System.out.println("value = " + value);
		}
		catch (Exception e)
		{
			System.out.println("(catch block) index = " + e.getMessage() + " does not exist for the given values[] array");
		}
		finally
		{
			
			System.out.println("finally block got executed.");
		}
		
		System.out.println("end of main() method");
	}

}
