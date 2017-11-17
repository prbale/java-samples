package DesignPatterns.CreationalDesignPatterns.SingletonPattern.ThreadSafeSingleton;

/**
 * This is the easiest way of making the thread safe singleton is make the global access method <b>synchronized.</b>
 * This approach will provide the thread safety but reduce the performance because cost associated with the synchronized
 * method.
 *
 * We will consider <b>Double checked locking</b> to reduce this cost. In this approach, synchronized block is used
 * insed the if condition with an additional check to ensure the only one instance of singlton class is created.
 *
 * @author Prashant
 */
public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
        System.out.println("Creating..!");
    }

    public static synchronized ThreadSafeSingleton getInstance() {

        if(instance == null)
            instance = new ThreadSafeSingleton();

        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello Prashant !");
    }

}

class ThreadSafeSingletonWithDoubleCheck {

    private static volatile ThreadSafeSingletonWithDoubleCheck instance;

    private ThreadSafeSingletonWithDoubleCheck() {}

    public static ThreadSafeSingletonWithDoubleCheck getInstance() {

        if(instance == null) {
            synchronized (ThreadSafeSingletonWithDoubleCheck.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingletonWithDoubleCheck();
                }
            }
        }

        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello Prashant !");
    }

}
