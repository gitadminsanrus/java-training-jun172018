import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("P001", "A", "B");
		
		System.out.println(p1);
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(-30);
		arrayList.add(100);
		arrayList.add("ABC");
		arrayList.add(true);
		arrayList.add('Z');
		arrayList.add(50.50);
		arrayList.add(new Object());
		arrayList.add(p1);
		
		System.out.println(arrayList);
		
		System.out.println("arrayList.indexOf(10) => " + arrayList.indexOf(10));
		System.out.println("arrayList.indexOf(10) => " + arrayList.indexOf(10));
		System.out.println("arrayList.size() => " + arrayList.size());
		
		boolean isRemoved = arrayList.remove(p1);
		System.out.println("Is p1 object removed from the array list: " + isRemoved);
		
		arrayList.clear();
		System.out.println(arrayList);

	}

}
