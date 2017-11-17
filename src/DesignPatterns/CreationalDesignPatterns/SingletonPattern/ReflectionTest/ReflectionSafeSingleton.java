package DesignPatterns.CreationalDesignPatterns.SingletonPattern.ReflectionTest;

public class ReflectionSafeSingleton {

	private static final ReflectionSafeSingleton instance = new ReflectionSafeSingleton();

	private ReflectionSafeSingleton() {
		System.out.println("Singleton() : Initializing instance");

		// Throw exception if instance is already created.
		// This will not create another instance using reflection as well.
		if (instance != null) {
			throw new RuntimeException("Can't create instance. Please use getInstance() method.");
		}
	}
	
	public static ReflectionSafeSingleton getInstance() {
		return instance;
	}
 
	public void displayMessage() {
		System.out.println("Hello Prashant !");
	}
}