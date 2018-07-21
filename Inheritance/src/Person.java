
public class Person {
	
	String firstName;
	String lastName;
	int age;
	char gender;
	
	Person() {
		
	}
	
	//Person(String, String, int, char)
	Person(String firstName, String lastName, int age, char gender) {
		if (gender == 'M' || gender == 'm') {
			this.firstName = "Mr." + firstName;
		} else if (gender == 'F' || gender == 'f') {
			this.firstName = "Ms." + firstName;
		} else {
			this.firstName = firstName;			
		}
		
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
//	Person(String firstName, String lastName, int age) {
//		this(firstName, lastName, age, '\0');
//	}
//	
//	Person(String firstName, String lastName) {
//		this(firstName, lastName, 0, '\0');
//	}

}
