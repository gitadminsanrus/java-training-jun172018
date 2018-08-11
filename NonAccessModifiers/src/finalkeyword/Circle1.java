package finalkeyword;

import statickeyword.Circle;

public class Circle1 extends Circle {
	
	protected final static int z = 25;

	public Circle1(double radius) {
		super(radius);
		System.out.println(super.z);
	}

}
