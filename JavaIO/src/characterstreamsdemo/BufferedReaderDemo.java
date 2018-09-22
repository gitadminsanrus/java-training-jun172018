package characterstreamsdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate the input file
		File inputFile = new File("/Users/sanrustrainingcentre/Desktop/test1.txt");
		
		try {
			//Step 2: Create file input stream object
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//Step 3: Start reading the file
			String data = bufferedReader.readLine();
			while (data != null) {
				System.out.println(data);
				data = bufferedReader.readLine();
			}
			
			//Step 4: Close the input stream
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
