package Multithreading.ThreadAPI;

import java.util.concurrent.TimeUnit;

public class ForthWay {

	public static void main(String[] args) {
		
		new ThirdTask();
		new ThirdTask();
		
		
	}
}

class ThirdTask implements Runnable {
	
	private static int count = 0;
	private int id;
	
	public ThirdTask() {
		this.id = count++;
		new Thread(this).start();
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
