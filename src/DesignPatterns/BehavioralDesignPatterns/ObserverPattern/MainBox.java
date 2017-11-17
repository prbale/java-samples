package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;

public class MainBox implements Subject {

	ArrayList<Observer> observerList = null;
	
	public MainBox() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
		
	}

	@Override
	public void unregisterObserver(Observer o) {
		int i = observerList.indexOf(o);
		if(i >= 0)
			observerList.remove(i);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observerList) {
			obs.receiveData("Hello from Mainbox");
		}
		
	}

	
}
