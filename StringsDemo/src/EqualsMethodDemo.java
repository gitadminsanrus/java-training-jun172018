
public class EqualsMethodDemo {

	public static void main(String[] args) {

		
		Person p1 = new Person("ABC", "DEF", 20, 'F');
		Person p2 = new Person("ABC", "DEF", 20, 'F');
		Person p3 = null;
		
		System.out.println("(p1 == p2) ==> " + (p1 == p2));
		System.out.println("(p1.equals(p2)) ==> " + p1.equals(p2));
		System.out.println("(p1.equals(p3)) ==> " + p2.equals(p3));

	}

}
