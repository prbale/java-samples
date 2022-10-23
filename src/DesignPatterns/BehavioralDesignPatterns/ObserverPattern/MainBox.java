package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;

public class MainBox implements Subject {

	// Maintain observer's list
	ArrayList<Observer> observerList = null;
	
	public MainBox() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		if(!isAlreadyRegistered(o)) {
			observerList.add(o);
		}
		else {
			System.out.println("Observer already registered !!!");
		}
	}

	private boolean isAlreadyRegistered(Observer o) {
		for(Observer obs : observerList) {
			if(o.equals(obs)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void unregisterObserver(Observer o) {
		int i = observerList.indexOf(o);
		if(i >= 0)
			observerList.remove(i);
	}

	@Override
	public void notifyObservers(String message) {
		for(Observer obs : observerList) {
			obs.receiveData("Message from Mainbox: " + message);
		}
		
	}

	
}
