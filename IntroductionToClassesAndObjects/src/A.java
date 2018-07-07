
public class A {
	
	//Has Inputs and No Output
	//x and ch are called method parameters
	void method1(int x, char ch)
	{
		System.out.println("\"void method1(int x, char ch)\" of A class is called. "
									+ "[x, ch] => [" + x +", " + ch + "]");
	}
	
	//methods can also accept object references
	void method2(Box b)
	{
		System.out.println("\"void method1(Box b)\" of A class is called. [b] => [" + b + "]");		
	}
	
	boolean getResult(int x)
	{
		
		boolean result;
		if (x > 0)
		{
			result = true;
		} 
		else
		{
			result = false;
		}
		
		return result;
	}
	
	
	Box getBox(int h, int w, int l)
	{
		
		if (h > 0 && w > 0 && l > 0)
		{
			Box b;
			b = new Box();
			b.h = h;
			b.l = l;
			b.w = w;
			
			return b;
		} else {
			return null;
		}
	
	}
	
	
	void display()
	{
		System.out.println("No I/P and O/P method executed");
		
		//following return statement is redundant
		return;
	}
	
	int[] getMarks()
	{
		int marks[] = {10, 20, 30};
		return marks;
	}

	void method10(int x)
	{
		if (x > 100)
		{
			System.out.println("method1(x) =>  " + x);
		} 
		else if (x > 0)
		{
			return;
		}
		
		System.out.println("End of method10(int x)");
	}

}
