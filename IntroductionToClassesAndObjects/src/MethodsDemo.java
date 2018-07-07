
public class MethodsDemo {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		//10, 'B' are called method arguments
		a1.method1(10,  'B');
		
		Box b10 = new Box();
		a1.method2(b10);
		
		boolean result = a1.getResult(10);
		int z = 20;
		if (result == true)
		{
			z++;
		}
		else {
			z--;
		}
		
		System.out.println("z = " + z);
		
		
		Box b1 = a1.getBox(-1, 2, 3);
		if (b1 != null) {
			b1.h = 25;
			System.out.println("b1.h => " + b1.h);
		}
		
		a1.display();
		
		
		a1.method10(50);
		
	}

}
