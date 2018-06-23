
public class SingleDimenArrayDemo 
{

	public static void main(String[] args) 
	{
		//1st way of creating an array
		
		//array declaration
		int studentMarks[];
		
		//array initialization
		studentMarks = new int[5];//array of 5 int cells
		
		//storing values into an array cell
		studentMarks[0] = 80;
		studentMarks[1] = 81;
		studentMarks[2] = 82;
		studentMarks[3] = 83;
		studentMarks[4] = 84;
		
		//reading values from an array cell
		System.out.println(studentMarks[0]);
		
		int tempVariable = studentMarks[1];
		System.out.println(tempVariable);
		
		
		
		//2nd way of creating an array
		int x1 = 10;
		int studentMarks1[] = {x1, 20, 30, 40, 50};
		
		
		//3rd way of creating an array;
		int studentMarks2[] = new int[] {x1, 20, 30, 40, 50};
		
		//prints length of an array
		System.out.println("studentMarks.length => " + studentMarks.length);
		
//		System.out.println(studentMarks[100]); //=> This statement causes an app crash as we cannot access an array index beyond its bounds. 
		
		System.out.println("End of method");
		
		
		
	}

}
