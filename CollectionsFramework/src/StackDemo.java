import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack data = new Stack();
		data.push(10);
		data.push(20);
		data.push(30);
			
		System.out.println(data.peek());
		
		System.out.println(data.pop());
		System.out.println(data.pop());
		System.out.println(data.pop());

	}

}
