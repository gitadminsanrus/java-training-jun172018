package abc;

public class HondaCarModel2018 extends HondaCar {

	public HondaCarModel2018(String modelNumber) {
		super(modelNumber);
	}

	public void accelerate() {
		System.out.println(modelNumber);
		System.out.println("Honda car model 2018 acceleration.");
		super.accelerate();
	}
	
	

}
