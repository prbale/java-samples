package Multithreading.ThreadAPI;

import java.util.concurrent.TimeUnit;

public class FifthWay {

	public static void main(String[] args) {

		System.out.println("Main Thread Starts Here...");
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0; i< 10 ; i++) {
					System.out.println("Tick Tick " + i);
				
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t.start();
		
		
		
		System.out.println("Main Thread Ends Here...");
		
	}
}
