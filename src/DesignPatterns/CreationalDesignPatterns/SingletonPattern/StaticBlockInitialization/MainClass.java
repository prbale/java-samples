package DesignPatterns.CreationalDesignPatterns.SingletonPattern.StaticBlockInitialization;

import DesignPatterns.CreationalDesignPatterns.SingletonPattern.EagerInitialization.EagerInitializedSingleton;

public class MainClass {
	
    public static void main(String[] args) {

		StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance3 = StaticBlockSingleton.getInstance();
    	
    	instance1.displayMessage();
    	instance2.displayMessage();
    	instance3.displayMessage();
    }
}