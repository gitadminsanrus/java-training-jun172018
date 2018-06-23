
public class DataTypesDemo {

	public static void main(String[] args) {
		
		byte b = 127;
		short s = -32768;
		int x = b;
		long l = 12345678909876l;
		
		boolean r = true;
		
		float f = 3.1412345678765432345678987654345678f;
		double d = 3.1423456897654567898765434567898765456787654;
		
		char ch = 'A';
		
		
		System.out.println(b);
		System.out.println(x);
		System.out.println(r);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		
		ch = '\u0775';
		System.out.println(ch);
		
		ch = '\u00B0';
		System.out.println("25" + ch + " C");
		
		
		String str = "Hello World";
		System.out.println(str);
		
		str = "Hello \" World";
		System.out.println(str);
		
		str = "Hello \\ World";
		System.out.println(str);

	}

}
