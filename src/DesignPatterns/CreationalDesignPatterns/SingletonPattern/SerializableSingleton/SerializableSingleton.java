package DesignPatterns.CreationalDesignPatterns.SingletonPattern.SerializableSingleton;

import java.io.Serializable;

/**
 * Created by Prashant on 11-10-2017.
 */
class SerializableSingletonBad implements Serializable {

    private static final long serialVersionID = -7604766932017737115L;

    private static final SerializableSingletonBad instance = new SerializableSingletonBad();

    private SerializableSingletonBad() {
        System.out.println("Creating instance...!!");
    }

    public static SerializableSingletonBad getInstance() {
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello Prashant !");
    }
}

class SerializableSingletonGood implements Serializable {

    private static final long serialVersionID = -7604766932017737115L;

    private static final SerializableSingletonGood instance = new SerializableSingletonGood();

    private SerializableSingletonGood() {
        System.out.println("Creating instance...!!");
    }

    public static SerializableSingletonGood getInstance() {
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello Prashant !");
    }

    // --- IMPORTANT ----
    // To avoid serialization to break the Singleton policy,
    // we need to add below method which will return the same instance.
    protected Object readResolve() {
        return getInstance();
    }
}