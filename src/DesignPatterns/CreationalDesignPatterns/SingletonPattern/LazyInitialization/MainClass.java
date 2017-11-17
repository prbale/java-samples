package DesignPatterns.CreationalDesignPatterns.SingletonPattern.LazyInitialization;

public class MainClass {
	
    public static void main(String[] args) {

		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance3 = LazyInitializedSingleton.getInstance();
    	
    	instance1.displayMessage();
    	instance2.displayMessage();
    	instance3.displayMessage();
    }
}