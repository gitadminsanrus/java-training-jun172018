
public class Demo {
	
	public static void main(String[] args) {
		
//		//Example 1
//		A a1 = new A();
//		B b1 = new B();
//		C c1 = new C();
//		
//		executeCallMeMethod(a1);
//		executeCallMeMethod(b1);
//		executeCallMeMethod(c1);
		
		//Example 2
		A objects[] = 
			{
					new A(),
					new B(),
					new C(),
					new B()
			};
		
		for (int index = 0; index < objects.length; index++) {
			A a = objects[index];
			executeCallMeMethod(a);
			
			if (a instanceof C)
			{
				C c = (C) a;
				c.method3();
			} else if (a instanceof B) {
				B b = (B) a;
				b.method2();
			}
		}
		
		System.out.println("end of main() method");
	}
	
	static void executeCallMeMethod(A a) {
		a.callMe();
	}
}
