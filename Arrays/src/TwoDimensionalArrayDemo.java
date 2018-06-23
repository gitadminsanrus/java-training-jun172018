
public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		
		//1st way of creating two dimensional array
		int studentMarks[][];
		
		//two dimensional arrays are like excel sheet with rows and columns
		//60 => corresponds to row count
		//5  => corresponds to column count
		studentMarks = new int[60][5];
		
		
		//reading values from two dimensional array
		//rowIndex = 0 corresponds to first student
		//columnIndex = 4 corresponds to 5th course
		int student1Course5 = studentMarks[0][4];
		studentMarks[2][3] = 80;//storing 80 in 3rd row and 4th column.
		
		//2nd way of creating two dimensional array
		//below array does not have fixed column for their rows, and hence they are called as "Jagged" arrays.
		int studentMarks1[][] = 
			{
					{10, 20, 30},
					{40, 50},
					{60}
			};
		
		System.out.println("Total number of rows in studentMarks1 arrays is: " + studentMarks1.length);
		System.out.println("1st row column count => " + studentMarks1[0].length);
		System.out.println("2nd row column count => " + studentMarks1[1].length);
		System.out.println("3rd row column count => " + studentMarks1[2].length);
		
		//3rd way of creating an array
		int studentmark2[][] = new int[][] 
								{
									{20, 30, 40},
									{50, 60, 70, 80}
								};
								
		int values[] = {10, 20, 30, 40, 50, 60, 70};
		studentmark2[1] = values;

	}

}
