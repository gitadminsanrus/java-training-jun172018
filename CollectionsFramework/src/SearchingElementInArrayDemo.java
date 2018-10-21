
public class SearchingElementInArrayDemo {

	public static void main(String[] args) {

		int[] array = {10, -2, 30, 100, 35, 67};
		
		if (args != null && args.length > 0) {
			int number = Integer.parseInt(args[0]);
			
			int position = -1;
			for (int index = 0; index < array.length; index++) {
				if (number == array[index]) {
					position = index;
					break;
				}
			}
			
			
			if (position != -1) {
				System.out.println("Found number in array at location = " + (position + 1));
			} else {
				System.out.println("Number not found in the array.");
			}
			
		}
		
	}

}
