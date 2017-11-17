package DesignPatterns.StructuralDesignPatterns.AdapterPattern.ObjectAdapter;

import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Socket;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.SocketAdapter;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Volt;

/**
 * Created by Prashant on 11-10-2017.
 */
public class SocketClassAdapterImpl implements SocketAdapter {

    // Using composition for Adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
