
public class PersonDemo 
{

	public static void main(String[] args) 
	{
		//Object variable declaration
		Person p1;
		
		//object initialization
		p1 = new Person();
		
		p1.firstName = "ABC";
		p1.lastName = "DEF";
		p1.age = 20;
		p1.gender = 'M';
		
		System.out.println("First Name of P1 is => " + p1.firstName);
		System.out.println("Last Name of P1 is => " + p1.lastName);
		System.out.println("Age of P1 is => " + p1.age);
		System.out.println("Gender of P1 is => " + p1.gender);
	}

}
