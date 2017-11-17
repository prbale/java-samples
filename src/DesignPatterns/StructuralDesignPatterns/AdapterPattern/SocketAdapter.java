package DesignPatterns.StructuralDesignPatterns.AdapterPattern;

/**
 * Created by Prashant on 11-10-2017.
 */
public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
