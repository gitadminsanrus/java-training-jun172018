import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("P001", "A", "B");
		
		System.out.println(p1);
		
		LinkedList data = new LinkedList();
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(20);
		data.add(-30);
		data.add(100);
		data.add("ABC");
		data.add(true);
		data.add('Z');
		data.add(50.50);
		data.add(new Object());
		data.add(p1);
		
		System.out.println(data);
		
		System.out.println("arrayList.indexOf(10) => " + data.indexOf(10));
		System.out.println("arrayList.indexOf(10) => " + data.indexOf(10));
		System.out.println("arrayList.size() => " + data.size());
		
		boolean isRemoved = data.remove(p1);
		System.out.println("Is p1 object removed from the array list: " + isRemoved);
		
		data.clear();
		System.out.println(data);

	}

}
