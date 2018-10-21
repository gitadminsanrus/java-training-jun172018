import java.util.Comparator;

public class FirstNameComparator implements Comparator {
	
	private boolean isDescendingOrder;
	
	public FirstNameComparator(boolean isDescendingOrder) {
		this.isDescendingOrder = isDescendingOrder;
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Person 
				&& o2 instanceof Person) {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			
			if (isDescendingOrder) {
				return p2.getFirstName().compareTo(p1.getFirstName());
			} else {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
		}
		
		return 0;
	}
	

}
