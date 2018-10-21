import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue data = new PriorityQueue();
		data.add(20);
		data.add(30);
		
		System.out.println(data.peek());
		System.out.println(data.poll());

	}

}
