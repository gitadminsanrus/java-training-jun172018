import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("P001", "A", "B");
		Person p5 = new Person("P005", "A5", "B5");
		Person p8 = new Person("P008", "A8", "B8");
		
		LinkedHashMap personData = new LinkedHashMap();
		personData.put("P001", p1);
		personData.put("P005", p5);
		personData.put("P008", p8);
		
		System.out.println(personData);
		
		Person p11 = (Person) personData.get("P001");
		System.out.println(p11);

		personData.put("P001", p8);
		
		Person p18 = (Person) personData.get("P001");
		System.out.println(p18);
		
		Set personKeys = personData.keySet();
		Iterator personKeysIterator = personKeys.iterator();
		
		while (personKeysIterator.hasNext()) {
			System.out.println(personKeysIterator.next());
		}
		
		//for each loop 
		for (Object key : personKeys) {
			System.out.println(key);
		}
	}

}
