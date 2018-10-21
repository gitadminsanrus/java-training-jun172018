import java.util.Comparator;

public class LastNameComparator implements Comparator {
	
	private boolean isDescendingOrder;
	
	public LastNameComparator(boolean isDescendingOrder) {
		this.isDescendingOrder = isDescendingOrder;
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Person 
				&& o2 instanceof Person) {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			
			if (isDescendingOrder) {
				return p2.getLastName().compareTo(p1.getLastName());
			} else {
				return p1.getLastName().compareTo(p2.getLastName());
			}
			
		}
		
		return 0;
	}
	

}
