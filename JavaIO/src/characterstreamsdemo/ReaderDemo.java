package characterstreamsdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate the input file
		File inputFile = new File("/Users/sanrustrainingcentre/Desktop/test1.txt");
		
		try {
			//Step 2: Create file input stream object
			FileReader fileReader = new FileReader(inputFile);
			
			//Step 3: Start reading the file
			//Approach 1
//					int data = fileInputStream.read();
//					while (data != -1) {//-1 signifies end of the file data 
//						System.out.print((char) data);
//						data = fileInputStream.read();
//					}
			
			//Approach 2
			char data[] = new char[1024];
			
			int endOfFile = fileReader.read(data);
			String str = new String(data);
			System.out.println(str);
			
			
			//Step 4: Close the input stream
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
