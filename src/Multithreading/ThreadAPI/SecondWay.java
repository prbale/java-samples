package Multithreading.ThreadAPI;

import java.util.concurrent.TimeUnit;

public class SecondWay {

	public static void main(String[] args) {
		
		new SecondTask().start();;
		
		Thread t = new SecondTask();
		t.start();
		
	}
}

class SecondTask extends Thread {
	
	private static int count = 0;
	private int id;
	
	public SecondTask() {
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
