package statickeyword;

public class ProgramArgumentsDemo {

	public static void main(String[] args) 
	{
		if (args != null && args.length > 0)
		{
			for (int index = 0; index < args.length; index++)
			{
				System.out.println(args[index]);
			}
		} 
		else 
		{
			System.out.println("No arguments passed");
		}
	}

}
