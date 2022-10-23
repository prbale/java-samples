package DesignPatterns.CreationalDesignPatterns.SingletonPattern.StaticBlockInitialization;

public class MainClass {
	
    public static void main(String[] args) {

		StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance3 = StaticBlockSingleton.getInstance();
    	
    	instance1.displayMessage();
    	instance2.displayMessage();
    	instance3.displayMessage();

    	System.out.println("Printing Instance 1 " + instance1);
		System.out.println("Printing Instance 2 " + instance2);
		System.out.println("Printing Instance 3 " + instance3);
    }
}