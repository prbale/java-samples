package Multithreading.ThreadAPI;

import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		
		new FirstTask();
		
		Thread t = new FirstTask();
		
	}
}

class FirstTask extends Thread {
	
	private static int count = 0;
	private int id;
	
	// As soon as instance created for this task. Thread will started immediately
	public FirstTask() {
		this.id = count++;
		this.start();
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
