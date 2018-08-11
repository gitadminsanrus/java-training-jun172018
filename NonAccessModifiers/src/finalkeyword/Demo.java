package finalkeyword;

import statickeyword.Circle;

public class Demo {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.method1(10);
		A a2 = new A(20);
//		A a3 = new A();
		
		//a1.x = 20;
		
		System.out.println(a1.x);
//		System.out.println(a2.x);
//		System.out.println(a3.x);
		
		Circle c1 = new Circle(25);

	}

}
