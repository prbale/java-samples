package Multithreading.ThreadAPI;

import java.util.concurrent.TimeUnit;

public class ThirdWay {

	public static void main(String[] args) {
		
		new Thread(new ForthTask()).start();;
		Thread t = new Thread(new ForthTask());
		t.start();
		
	}
}

class ForthTask implements Runnable {
	
	private static int count = 0;
	private int id;
	
	public ForthTask() {
		this.id = count++;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i < 10; i++) {
			System.out.println("Thread : " + id + " - Tick Tick " + i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}
	
}
