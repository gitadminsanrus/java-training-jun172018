
public class ExceptionDemo {

	public static void main(String[] args) {
		
		int values[] = {10, 20, 30, 40, 50};
		
		
		int index = 0;
		System.out.println(values[index]);
		
		index = 999;
//		if (index < values.length)
//		{
//			
//		}
		
		//Array index out of bounds exception
		//occurs when you try to access array cell beyond its boundaries
		if (index < values.length) {
			System.out.println(values[index]);
		}
		
		Object obj = null;
		if (obj != null) {
			obj.toString();
		}
		
		System.out.println("end of main() method");
	}

}
