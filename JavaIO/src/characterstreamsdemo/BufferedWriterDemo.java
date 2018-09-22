package characterstreamsdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate the input file
		File outputFile = new File("/Users/sanrustrainingcentre/Desktop/test2-output.txt");
		
		try {
			//Step 2: Create file input stream object
			FileWriter fileWriter = new FileWriter(outputFile, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 16 * 1024);
			
			String str = "askdjhf alksjhf ajlshflkjashdf kajshf jasfh";
			
			//step 3: write string data
			bufferedWriter.write(str);
			
			//Step 4: Close the input stream
			bufferedWriter.flush();
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
