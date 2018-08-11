package finalkeyword;

public final class A {
	
	final int x = 10;//static constant
	final int y;//dynamic constant
	int z = 20;
	
	
	//object scope default initialization block
	{
		System.out.println("Before Initialization block: " + z);
		z = 30;
		System.out.println("After Initialization block: " + z);
	}
	
	
	A() {
		System.out.println("A() constructor. => " + z);
		y = 25;//after this no changes are permitted on y
	}
	
	A(final int y)
	{
		//final instance constants can be assigned in constructor
		this.y = y;//after this no changes are permitted on y
	}
	
	A(int x, int y) {
//		this.x = x;
		this.y = y;
	}
	
	
	void method1(final int t) {
//		t = 25;
		
		final int x1;
		x1 = t + 20;
		System.out.println(x1);
	}
	

}














