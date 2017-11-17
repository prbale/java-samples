package DesignPatterns.StructuralDesignPatterns.AdapterPattern.ObjectAdapter;

import DesignPatterns.StructuralDesignPatterns.AdapterPattern.ClassAdapter.SocketClassAdapterImpl;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Volt;

public class MainClass {
	
    public static void main(String[] args) {

		DesignPatterns.StructuralDesignPatterns.AdapterPattern.ClassAdapter.SocketClassAdapterImpl socket = new SocketClassAdapterImpl();
		Volt v1 = socket.get12Volt();
		Volt v2 = socket.get3Volt();
		Volt v3 = socket.get120Volt();

		System.out.println("Volt : " + v3.getVolts());
		System.out.println("Volt : " + v1.getVolts());
		System.out.println("Volt : " + v2.getVolts());
	}
}