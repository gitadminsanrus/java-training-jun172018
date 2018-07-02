import java.util.Scanner;

public class DoWhileStatementDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userInput;
		do 
		{
			System.out.println("-----------Menu List--------");
			System.out.println("Select a menu item from the given options below:-");
			System.out.println("A. Coffee");
			System.out.println("B. Tea");
			System.out.println("C. Bagel");
			System.out.println("Enter 'X' or 'x' to exit the menu.");
			
			//User Input. Command Prompt gets blocked until user provides some data
			userInput = scanner.next();
			System.out.println(userInput);
			
			if (userInput.equalsIgnoreCase("A"))
			{
				System.out.println("Ordered coffee.. Wait time is 3 mins.");
			}
			else if (userInput.equalsIgnoreCase("B"))
			{
				System.out.println("Ordered tea.. Wait time is 2 mins.");
			}
			else if (userInput.equalsIgnoreCase("C"))
			{
				System.out.println("Ordered bagel.. Wait time is 5 mins.");
			}
			else 
			{
				if (!userInput.equalsIgnoreCase("x")) {
					System.out.println("Invalid entry. Please try again.");
				} 
				else 
				{
					System.out.println("Exiting the menu.. Bye");
				}
			}
			
		} while(!userInput.equalsIgnoreCase("x"));

	}

}
