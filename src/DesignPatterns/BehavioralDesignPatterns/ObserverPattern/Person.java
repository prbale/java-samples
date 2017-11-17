package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

public class Person implements Observer {

	@Override
	public void receiveData(String data) {
		// TODO Auto-generated method stub
		System.out.println("Person : Data Received : " + data);
	}

}
