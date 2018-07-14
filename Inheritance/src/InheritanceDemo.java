
public class InheritanceDemo {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		
		a1.i = 10;
		
		
		b1.j = 20;
		b1.i = 25;
		
		Customer c1 = new Customer();
		System.out.println(a1.i);
		System.out.println(c1);
		

	}

}
