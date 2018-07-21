public class Animal {
	//every animal will have eat() behavior
	void eat()
	{
		System.out.println("Every animal can eat.");
	}
	
	void sleep()
	{
		System.out.println("Every animal can sleep.");
	}
	
	int getValue() {
		return 10;
	}
	
	A getObject() {
		return (new A());
	}

}
