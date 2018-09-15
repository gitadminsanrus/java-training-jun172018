
public class MyThread extends Thread {
	
	
	public void run() {
		for (int index = 0; index < 50; index++) {
			System.out.println("[MyThread] index = " + index);
		}
	}

}
