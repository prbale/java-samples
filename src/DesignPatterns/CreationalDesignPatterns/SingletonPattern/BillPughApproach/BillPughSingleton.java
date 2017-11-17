package DesignPatterns.CreationalDesignPatterns.SingletonPattern.BillPughApproach;

/**
 *	This approach uses <b>inner static helper class</b> approach
 *	When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls
 *	the getInstance method, this class gets loaded and creates the Singleton class instance.
 *	It doesn’t require synchronization and it is Thread safe.
 *
 * 	@author Prashant
 *
 */
public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("Singleton() : Initializing instance");
	}
	
	public static class SingletonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}
 
	public void displayMessage() {
		System.out.println("Hello Prashant !");
	}
}