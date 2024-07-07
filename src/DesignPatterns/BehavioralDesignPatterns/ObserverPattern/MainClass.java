package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

public class MainClass {
	
    public static void main(String[] args) {
    	
    	MainBox mb = new MainBox();

    	Person p = new Person("Prashant");
    	Companies c = new Companies("Nokia");

    	// Register Person to Mail box
    	mb.registerObserver(p);
		mb.registerObserver(p);
		mb.registerObserver(p);
		// Register Company to Mail box
    	mb.registerObserver(c);

    	// Notify
    	mb.notifyObservers("welcome to MailBox !!");
		System.out.println("");
    	// Unregister Company from Mail box
    	mb.unregisterObserver(c);
		// Notify and Check compay should not get any notification
    	mb.notifyObservers("This is new message from MailBox.");
    	
    }
}