
public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("ABC", "DEF", 18, 'F');
		Person p2 = new Person("GHI", "JKL");
		
		System.out.println(p1.getFullName());
		System.out.println(p2.getFullName());

	}

}
