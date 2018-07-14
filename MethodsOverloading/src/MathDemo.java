
public class MathDemo {

	public static void main(String[] args) {

		Math math = new Math();
		int z1 = math.add(2, 3);
		
		byte b1 = 5;
		int b2 = 10;
		byte b3 = 50;
		int z2 = math.add(b1, b2);
		int z3 = math.add(b1, b3);
		
		double z4 = math.add(0.5, 0.6f);
		
		long l = 87936598723649582L;
		math.add(l, l);
		
	}

}
