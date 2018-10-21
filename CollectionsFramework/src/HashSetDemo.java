import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("P001", "A", "B");
		Person p2 = new Person("P001", "A", "B");
		Person p3 = new Person("P001", "A", "B");
		Person p4 = new Person("P001", "A", "B");
		Person p5 = new Person("P005", "A5", "B5");
		Person p6 = new Person("P001", "A", "B");
		Person p7 = new Person("P001", "A", "B");
		Person p8 = new Person("P008", "A8", "B8");
		
		HashSet personData = new HashSet();
		personData.add(p1);
		personData.add(p2);
		personData.add(p3);
		personData.add(p4);
		personData.add(p5);
		personData.add(p6);
		personData.add(p7);
		personData.add(p8);
		
		System.out.println(personData);
		
		Iterator setValues = personData.iterator();
		while (setValues.hasNext()) {
			System.out.println(setValues.next());
		}

	}

}
