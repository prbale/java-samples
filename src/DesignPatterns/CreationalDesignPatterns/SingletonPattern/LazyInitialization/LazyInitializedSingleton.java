package DesignPatterns.CreationalDesignPatterns.SingletonPattern.LazyInitialization;

/**
 * Singleton pattern creates the instance in the global access method.
 * Not Thread safe.
 * Created by Prashant on 10-10-2017.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello Prashant !");
    }
}
