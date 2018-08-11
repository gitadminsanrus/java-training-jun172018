package abc;

public class HondaCar extends Car {

	public HondaCar(String modelNumber) {
		super(modelNumber);
	}

	protected void accelerate() {
		System.out.println("Honda manufacturer way of accelerating their cars.");
	}
	
	void brake() {
		
	}

}
