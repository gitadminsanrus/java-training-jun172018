
public class Customer extends Person {
	
	String customerId;
	
	Customer() {
		super(null, null);
	}
	
	Customer(String customerId) {
		super(null, null);
		this.customerId = customerId;
	}
	
	Customer(String firstName,
			String lastName,
			String customerId) {
		super(firstName, lastName);
		this.customerId = customerId;
	}
	
	Customer(int i) {
		super(null, null);
	}
	

}
