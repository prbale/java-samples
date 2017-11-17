package Multithreading.Common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {
	
	private static int count = 0;
	private int id;
	
	public LoopTaskA() {
		this.id = count++;
	}
	
	@Override
	public void run() {
		
		System.out.println("#### < Task : " + id + "> STARTING #######" );
		
		for(int i=0; i < 10; i++) {
			System.out.println("Thread : " + id + " - Tick Tick " + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		
		System.out.println("#### < Task : " + id + "> ENDING #######" );
	}


}
