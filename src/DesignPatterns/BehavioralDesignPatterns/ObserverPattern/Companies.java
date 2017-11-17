package DesignPatterns.BehavioralDesignPatterns.ObserverPattern;

public class Companies implements Observer {

	@Override
	public void receiveData(String data) {
		// TODO Auto-generated method stub
		System.out.println("Companies : Data Received : " + data);
	}

}
