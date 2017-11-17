package DesignPatterns.CreationalDesignPatterns.SingletonPattern.ThreadSafeSingleton;

public class MainClass {
	
    public static void main(String[] args) {

		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstance();

		ThreadSafeSingletonWithDoubleCheck instance4 = ThreadSafeSingletonWithDoubleCheck.getInstance();
    	
    	instance1.displayMessage();
    	instance2.displayMessage();
    	instance3.displayMessage();
		instance4.displayMessage();
    }
}