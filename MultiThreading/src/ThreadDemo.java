
public class ThreadDemo {

	public static void main(String[] args) {
		
		DownloadFileTask downloadFileTask = new DownloadFileTask();
				
		Thread downloadThread = new Thread(downloadFileTask);
		downloadThread.setPriority(Thread.MAX_PRIORITY);
		downloadThread.start();
		
		MyThread myThread = new MyThread();
		myThread.setPriority(Thread.MIN_PRIORITY);
		myThread.start();
		
		
		for (int index = 0; index < 50; index++) {
			System.out.println("main()... index = " + index);
		}
		
		try {
			downloadThread.join();
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() method is completed.");
		
	}

}
