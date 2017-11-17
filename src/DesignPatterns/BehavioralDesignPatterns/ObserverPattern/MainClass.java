package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

public class MainClass {
	
    public static void main(String[] args) {
    	
    	MainBox mb = new MainBox();
    	Person p = new Person();
    	Companies c = new Companies();
    	
    	mb.registerObserver(p);
    	mb.registerObserver(c);
    	mb.notifyObservers();
    	mb.unregisterObserver(c);
    	mb.notifyObservers();
    	
    }
}