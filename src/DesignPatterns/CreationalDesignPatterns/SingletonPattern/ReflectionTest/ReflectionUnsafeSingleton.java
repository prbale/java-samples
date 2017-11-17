package DesignPatterns.CreationalDesignPatterns.SingletonPattern.ReflectionTest;

public class ReflectionUnsafeSingleton {

	private static final ReflectionUnsafeSingleton instance = new ReflectionUnsafeSingleton();

	private ReflectionUnsafeSingleton() {
		System.out.println("Singleton() : Initializing instance");
	}
	
	public static ReflectionUnsafeSingleton getInstance() {
		return instance;
	}
 
	public void displayMessage() {
		System.out.println("Hello Prashant !");
	}
}