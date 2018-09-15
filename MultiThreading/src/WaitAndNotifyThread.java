
public class WaitAndNotifyThread {

	public static void main(String[] args) {
	
		
		DownloadFileTask task = new DownloadFileTask();
		Thread t1 = new Thread(task);
		t1.start();
		
		
		
		
		
		
//		for (int index = 0; index < 300000; index++) {
//			int z = index / 1000;
//			
//			
//		}
		
		System.out.println("main() method is completed.");
		
	}

}
