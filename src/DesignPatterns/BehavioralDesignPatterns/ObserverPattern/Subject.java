package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

// Mailbox is the Subject here
public interface Subject {
	
	public void registerObserver(Observer o);
	public void unregisterObserver(Observer o);
	public void notifyObservers(String message);
}