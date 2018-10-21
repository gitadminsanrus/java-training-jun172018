import java.util.ArrayList;
import java.util.Collections;

public class SortingPersonData {

	public static void main(String[] args) {
		
		ArrayList personData = new ArrayList();
		personData.add(new Person("P002", "Z", "R"));
		personData.add(new Person("P003", "A", "U"));
		personData.add(new Person("P001", "G", "F"));
		
		System.out.println("Before sorting the list => " + personData);
		Collections.sort(personData);
		System.out.println("After sorting the list => " + personData);
		
		//sorting the person data based on their first name
		Collections.sort(personData, new FirstNameComparator(true));
		System.out.println("After sorting the list based on their first name => " + personData);

		//sorting the person data based on their last name
		Collections.sort(personData, new LastNameComparator(false));
		System.out.println("After sorting the list based on their last name => " + personData);

	}

}
