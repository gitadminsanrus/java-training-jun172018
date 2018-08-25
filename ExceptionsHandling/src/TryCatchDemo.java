
public class TryCatchDemo {

	public static void main(String[] args) {
		
		int[] values = {10, 20, 30, 40, 50};
		
		try 
		{
			int value = values[10];
			System.out.println("value = " + value);
		}
		catch (Exception e)
		{
			System.out.println("index = " + e.getMessage() + " does not exist for the given values[] array");
//			e.printStackTrace();
		}
		
		System.out.println("end of main() method.");

	}

}
