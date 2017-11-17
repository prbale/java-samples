package Multithreading.ExecutorAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Multithreading.Common.LoopTaskA;

public class UsingFixedThreadPool {

	public static void main(String[] args) {

		System.out.println("Main Thread Starts Here...");
		
		// Pool of 3 threads
		ExecutorService execService = Executors.newFixedThreadPool(6);
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
	
		execService.shutdown();
		
		execService.execute(new LoopTaskA());
			
		System.out.println("Main Thread Ends Here...");
		
	}
}
