
public class Box 
{
	
	//below variables becomes part of "object scope"
	//they stay in memory till the object is deleted from memory
	double length;
	double height;
	double width;
	
	
	//variable 'a' belongs to method scope.
	//method scope is a higher scope than local and block scope.
	double getVolume(int a) 
	{
		
		//local scope variable
		int x = 0;
		System.out.println(x);
		
		if (x > 10)
		{
			//block scope variable
			int y = 10;
		}
		
		System.out.println(y);//this statement does not compile because y is out of scope
		
		return length * width * height;
	}
	
	

}
