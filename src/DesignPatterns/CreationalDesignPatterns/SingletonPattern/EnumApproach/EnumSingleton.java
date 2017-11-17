package DesignPatterns.CreationalDesignPatterns.SingletonPattern.EnumApproach;

/**
 * To oversome reflection issue on singleton approach, enum approach introduced
 *
 * Refer : http://javarevisited.blogspot.in/2012/07/why-enum-singleton-are-better-in-java.html
 *
 * Created by Prashant on 11-10-2017.
 */
public enum EnumSingleton {

    INSTANCE;

    public static void displayMessage() {
        System.out.println("Hello Prashant !");
    }
}
