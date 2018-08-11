package statickeyword;

public class Circle {
	
	private double radius;
	public static int count;
	protected final static int z = 20;
	
//	static
//	{
//		z = 20;
//	}
	
	public Circle(final double radius) {
		this.radius = radius;
		count++;
	}
	
	public double area() {
		count = 20;//object scope can see all the members of static scope
		return (2 * (22.0/7) * (22.0/7) * radius * radius);
	}
	
	public static int getCount() {
//		radius = 10; //=> static scope can access members of object scope
		return count;
	}

}
