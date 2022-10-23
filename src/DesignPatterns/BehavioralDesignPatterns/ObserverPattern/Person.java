package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

public class Person implements Observer {

	private String name = "";

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void receiveData(String data) {
		System.out.println("Hello Mr. " + this.name + ", You have a message: " + data);
	}

}
