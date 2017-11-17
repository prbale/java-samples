package DesignPatterns.StructuralDesignPatterns.ProxyPattern;

/**
 * Created by Prashant on 11-10-2017.
 */
public interface SocketInterface {
    String readLine();
    void writeLine(String str);
    void dispose();
}
