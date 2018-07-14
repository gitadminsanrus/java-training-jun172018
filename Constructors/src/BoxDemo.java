
public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1 = new Box(10, 15, 25);
		double vol1 = b1.volume();
		
		Box b2 = new Box();
		System.out.println(b2.volume());
//		b2.height = 29;
		
		
		System.out.println("Volume of box1 => " + vol1);

	}

}
