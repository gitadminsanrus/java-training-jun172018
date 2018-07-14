
public class Math {
	
	int add(int x, int y) {
		System.out.println("(int, int)");
		return (x + y);
	}
	
	int add (int x, int y, int z) {
		System.out.println("(int, int, int)");
		return (x + y + z);
	}
	
	double add (int x, double y, int z) {
		System.out.println("(int, double, int)");
		return (x + y + z);
	}
	
	byte add(byte x, byte y) {
		System.out.println("(byte, byte)");
		return (byte) (x + y);
	}
	
	int add(byte x, int y) {
		System.out.println("(byte, int)");
		return (x + y);
	}
	
	double add (float x, double y) {
		System.out.println("(float, double)");
		return (x + y);
	}
	
	float add (float x, float y) {
		System.out.println("(float, float)");
		return (x + y);
	}
	
	double add(double x, double y) {
		System.out.println("(double, double)");
		return (x + y);
	}
}
