package folder2;

import folder1.A;

public class B extends A {
	
	public B() {
		x = 10;
	}
	
	void methodB() {
		A a1 = new A();
		a1.x = 10;
	}

}
