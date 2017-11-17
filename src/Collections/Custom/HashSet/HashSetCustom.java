package Collections.Custom.HashSet;

import Collections.Custom.HashMap.HashMapCustom;

/**
 * Created by Prashant on 30-07-2016.
 * This class provides custom implementation of HashSet ( without using Java API )
 * which allows us to store values where duplicate values are not allowed.
 * Does not allow you to store null value
 * Does not maintain insertion order.
 * insertion order of key-value pair is not maintained.
 *
 */
public class HashSetCustom<E> {

    private HashMapCustom<E, Object> hashMapCustom;

    public HashSetCustom() {
        hashMapCustom = new HashMapCustom<>();
    }

    public void add(E value) {
        hashMapCustom.put(value, new Object());
    }


    public boolean contains(E value) {
        return hashMapCustom.containsKey(value) != null ? true : false;
    }


    public void display() {
        hashMapCustom.displaySet();
    }


    public boolean remove(E value) {
        return hashMapCustom.remove(value);
    }
}
