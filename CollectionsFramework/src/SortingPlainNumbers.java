import java.util.ArrayList;
import java.util.Collections;

public class SortingPlainNumbers {

	public static void main(String[] args) {
		
		ArrayList data = new ArrayList();
		
		data.add(-1);
		data.add(100);
		data.add(0);
		data.add(10);
		data.add(-10);
		data.add(60);
		data.add(54);
		data.add(1);
		data.add(11);
		data.add(-11);
		data.add(-90);
		
		
		System.out.println("Before sorting the list => " + data);
		
		Collections.sort(data);
		
		System.out.println("After sorting the list => " + data);
		

	}

}
