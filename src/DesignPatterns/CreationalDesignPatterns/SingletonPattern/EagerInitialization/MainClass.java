package DesignPatterns.CreationalDesignPatterns.SingletonPattern.EagerInitialization;

public class MainClass {
	
    public static void main(String[] args) {

		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance3 = EagerInitializedSingleton.getInstance();
    	
    	instance1.displayMessage();
    	instance2.displayMessage();
    	instance3.displayMessage();
    }
}