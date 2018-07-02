
public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 3;
		
		//& => AND operator
		System.out.println(x & y);
		
		//| => OR operator
		System.out.println(x | y);
		
		//XOR => Mutually exclusive OR operator
		System.out.println(x ^ y);
		
		//~ => NOT operator
		System.out.println(~x);
		
		String binaryValue = Integer.toBinaryString(100);
		System.out.println(binaryValue);
		
		
		int z = -10;
		System.out.println("(z >> 1) => " + (z >> 1));
		System.out.println("(z >>> 1) => " + (z >>> 1));
		System.out.println("(z << 1) => " + (z << 1));

	}

}
