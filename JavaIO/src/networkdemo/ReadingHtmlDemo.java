package networkdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ReadingHtmlDemo {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://oracle.com");
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
			InputStream is = httpsURLConnection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String data = br.readLine();
			
			while (data != null) {
				System.out.println(data);
				data = br.readLine();
			}
			
			br.close();
			httpsURLConnection.disconnect();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
