package streamsdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate the input file
		File outputFile = new File("/Users/sanrustrainingcentre/Desktop/test1-output.txt");
		
		try {
			//Step 2: Create file input stream object
			FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
			
			String str = "askdjhf alksjhf ajlshflkjashdf kajshf jasfh";
			
			//step 3: write string data
			byte[] data = str.getBytes();
//			for (int index = 0; index < data.length; index++) {
//				fileOutputStream.write(data[index]);
//			}
//			for (byte b : data) {
//				fileOutputStream.write(b);
//			}
			
			
			fileOutputStream.write(data);
			
			
			
			//Step 4: Close the input stream
			fileOutputStream.flush();
			fileOutputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
