
public class DataTypeCastingDemo {

	public static void main(String[] args) {
		
		byte b = 127;
		int i = b;
		
		int i1 = 127;
		//The below statement wont compile as 
		//it does narrowing conversion without an explicit casting 
//		byte b1 = i1;
		byte b1 = (byte) i1;
		
		int i2 = 1000;
		byte b2 = (byte) i2;
		
		System.out.println(i2);
		System.out.println(b2);
		
		double d = 12345678765432345678.5;
		int i3 = (int) d;
		
		System.out.println(i3);

	}

}
