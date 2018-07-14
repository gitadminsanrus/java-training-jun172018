
public class Person {
	
	String firstName;
	String lastName;
	int age;
	char gender;
	
//	{
//		firstName = "";
//		lastName = "";
//		age = 1;
//		gender = 'M';
//	}
	
	Person(String firstName, String lastName, int age, char gender) {
		if (gender == 'M') {
			this.firstName = "Mr. " + firstName;			
		} else if (gender == 'F') {
			this.firstName = "Ms." + firstName;
		}
		
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
	Person(String firstName, String lastName) {
		this(firstName, lastName, 0, '\0');
//		this.firstName = firstName;
//		this.lastName = lastName;
	}
	
	Person(String firstName, String lastName, char gender) {
//		if (gender == 'M') {
//			this.firstName = "Mr. " + firstName;			
//		} else if (gender == 'F') {
//			this.firstName = "Ms." + firstName;
//		}
		this(firstName, lastName, 0, gender);
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.gender = gender;
	}
	
	String getFullName() {
		return firstName + " " + lastName;
	}

}
