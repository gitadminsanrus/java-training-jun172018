
public class Customer extends Person {
	
	String customerId;
	
	Customer(String firstName,
			String lastName,
			int age,
			char gender,
			String customerId) {
		super(firstName, lastName, age, gender);
		this.customerId = customerId;
	}
	
	Customer(String firstName, String lastName, String customerId) {
//		this(firstName, lastName, 0, '\0', customerId);
		super(firstName, lastName, 0, '\0');
		this.customerId = customerId;
	}

}
