package DesignPatterns.StructuralDesignPatterns.AdapterPattern;

/**
 * Created by Prashant on 11-10-2017.
 */
public class Volt {
    private int volts;

    public Volt(int v) {
        volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
