package DesignPatterns.CreationalDesignPatterns.SingletonPattern.ReflectionTest;

import java.lang.reflect.Constructor;

/**
 * Created by Prashant on 11-10-2017.
 */

/**
 * Description:
 * Using reflection we can set the private constructor to become accessible at runtime.
 * Please find below two implementation which will show Unsafe to Reflection and Safe to Reflection
 * implementation of the Singleton class.
 */

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        ReflectionUnsafeSingleton instanceOne = ReflectionUnsafeSingleton.getInstance();
        ReflectionUnsafeSingleton instanceTwo = null;

        try {
            Constructor[] constructors = ReflectionUnsafeSingleton.class.getDeclaredConstructors();

            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);   // Singleton pattern destroyed here.
                instanceTwo = (ReflectionUnsafeSingleton) constructor.newInstance(); // Another instance created
                break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Note: Below two hashcode are different means Singleton property violates.
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

        ReflectionSafeSingleton instanceThree = ReflectionSafeSingleton.getInstance();
        ReflectionSafeSingleton instanceFour = null;

        try {
            Constructor[] constructors = ReflectionSafeSingleton.class.getDeclaredConstructors();

            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);   // Singleton pattern destroyed here.
                instanceFour = (ReflectionSafeSingleton) constructor.newInstance(); // Another instance created
                break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceThree.hashCode());

        // Note: This will throw an runtime exception
        // Caused by: java.lang.RuntimeException: Can't create instance. Please use getInstance()
        // method.
        System.out.println(instanceFour.hashCode());
    }
}
