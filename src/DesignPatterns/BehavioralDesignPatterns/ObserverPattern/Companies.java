package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

public class Companies implements Observer {

	private String name = "";

	public Companies(String name) {
		this.name = name;
	}

	@Override
	public void receiveData(String data) {
		System.out.println("To " + this.name + ", You have a message: " + data);
	}

}
