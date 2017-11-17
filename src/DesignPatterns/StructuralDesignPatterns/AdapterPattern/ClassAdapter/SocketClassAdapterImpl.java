package DesignPatterns.StructuralDesignPatterns.AdapterPattern.ClassAdapter;

import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Socket;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.SocketAdapter;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Volt;

/**
 * Created by Prashant on 11-10-2017.
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
