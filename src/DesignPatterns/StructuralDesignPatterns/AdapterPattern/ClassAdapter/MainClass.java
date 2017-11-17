package DesignPatterns.StructuralDesignPatterns.AdapterPattern.ClassAdapter;

import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Volt;

public class MainClass {
	
    public static void main(String[] args) {

		SocketClassAdapterImpl socket = new SocketClassAdapterImpl();
		Volt v1 = socket.get12Volt();
		Volt v2 = socket.get3Volt();
		Volt v3 = socket.get120Volt();

		System.out.println("Volt : " + v3.getVolts());
		System.out.println("Volt : " + v1.getVolts());
		System.out.println("Volt : " + v2.getVolts());
	}
}