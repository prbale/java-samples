package DesignPatterns.StructuralDesignPatterns.AdapterPattern;

/**
 * Created by Prashant on 11-10-2017.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
