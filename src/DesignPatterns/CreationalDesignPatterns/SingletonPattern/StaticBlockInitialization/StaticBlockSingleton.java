package DesignPatterns.CreationalDesignPatterns.SingletonPattern.StaticBlockInitialization;

/**
 * Static block initialization is similar to eager initialization, except that instance of class is created
 * in the static block that provides option for exception handling.
 * Not a best practice.
 * Thread safe
 * @author Prashant
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello Prashant !");
    }
}
