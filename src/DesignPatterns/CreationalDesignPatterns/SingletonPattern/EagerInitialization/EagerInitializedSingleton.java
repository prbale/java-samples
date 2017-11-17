package DesignPatterns.CreationalDesignPatterns.SingletonPattern.EagerInitialization;

/**
 * Eager initialization, instance of class is created at the time of class loading.
 * This is the easiest method to create a singlton class but it has some drawbacks like
 * 1. Instance is created even though client application might not be using it.
 * 2. Thread safe
 * 3. Can not have exception handling.
 * 4. Not a best practice.
 * @author Prashant
 *
 */
public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {
		System.out.println("Singleton() : Initializing instance");
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
 
	public void displayMessage() {
		System.out.println("Hello Prashant !");
	}
}