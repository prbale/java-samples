package Collections.Custom.HashMap;

/**
 * Created by Prashant on 30-07-2016.
 * This class provides custom implementation of HashMap ( without using Java API )
 * which allows us to store data in key-value pair form
 * insertion order of key-value pair is not maintained.
 *
 * Just to get internal working of hashmap :
 * http://www.dineshonjava.com/2013/06/how-does-java-hashmap-work-internally.html
 *
 */
public class HashMapCustom<K,V> {

    private Entry<K,V>[] table; // Array of Entry
    private static final int CAPACITY = 4;


    /**
     * We store key-value pair by using Entry
     * @param <K> Key
     * @param <V> Value
     */
    static class Entry<K,V> {

        K key;
        V value;
        Entry<K,V> next; // Next location

        public Entry(K key, V value, Entry<K,V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    // Constructor
    public HashMapCustom() {
        table = new Entry[CAPACITY];
    }


    /**
     * Method allows you to put key-value pair in HashSetCustom
     * If Map already contains key, then this will replace the value with newValue.
     * Null as a key is not allowed, whereas Null values are allowed.
     * You can put custom objects as a key as well.
     * @param newKey new key to add in HAshMap
     * @param newValue value for that key to be added in HashMap
     */
    public void put(K newKey, V newValue) {

        if(newKey != null) {

            // Calculate Hash of the key
            int hash = hash(newKey);

            // Create a new Entry
            Entry<K,V> newentry = new Entry<>(newKey, newValue, null);

            if(table[hash] == null) {
                table[hash] = newentry;
            }
            else {

                // Here means... table as entry at this location.

                Entry<K, V> previous = null;
                Entry<K, V> current = table[hash];

                while(current != null) {

                    if(current.key.equals(newKey)) {

                        if(previous == null) {

                            // Linked list not yet started... Only single element present.
                            newentry.next = current.next;
                            table[hash] = newentry;
                            return;

                        }
                        else {

                            // Keep moving newentry with linkedlist.
                            newentry.next = current.next;
                            previous.next = newentry;
                            return;
                        }

                    }
                    previous = current;
                    current = current.next;
                }

                // Previous next not set in if(prev==null) loop
                previous.next = newentry;
            }
        }

    }

    /**
     * Method returns the value corresponds to the key
     * @param key key for which we want to retrieve the value
     * @return value.
     */
    public V get(K key) {

        int hash = hash(key);

        if(table[hash] == null) {
            return null;
        }
        else {

            Entry<K,V> temp = table[hash];

            if(temp.next == null) {
                if(temp.key.equals(key)) {
                    return temp.value;
                }
            }

            while(temp.next != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }

            return null;
        }
    }

    public V containsValue(V value) {

        for (int i = 0; i < CAPACITY; i++) {
            if (table[i] != null) {

                Entry<K, V> entry = table[i];

                while (entry != null) {

                    if (entry.value.equals(value)) {
                        return entry.value;
                    }
                    entry = entry.next;
                }
            }
            else {
                continue;
            }

        }

        return null;
    }

    public K containsKey(K key) {

        for (int i = 0; i < CAPACITY; i++) {
            if (table[i] != null) {

                Entry<K, V> entry = table[i];

                while (entry != null) {

                    if (entry.key.equals(key)) {
                        return entry.key;
                    }
                    entry = entry.next;
                }
            }
            else {
                continue;
            }

        }

        return null;
    }



    /**
     * Method allows to delete the Entry from table when deleteKey matches the key set.
     * @param deleteKey key for EntryS
     * @return boolean value which indicates is entry deleted successfully or not.
     */
    public boolean remove(K deleteKey) {

        int hash = hash(deleteKey);

        if(table[hash] == null ) {
            return false;
        }
        else {

            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];

            while ( current != null ) {
                if (current.key.equals(deleteKey)) {

                    if (previous == null) {
                        table[hash] = table[hash].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }

                }

                previous = current;
                current = current.next;
            }

            return false;
        }
    }


    public void display() {

        for(int i = 0; i < CAPACITY ; i++ ) {
            if(table[i] != null) {

                Entry<K,V> entry = table[i];

                while(entry != null) {
                    System.out.println("{ " + entry.key + " , " + entry.value + " } ");
                    entry = entry.next;
                }
            }
        }
    }


    public void displaySet() {

        System.out.print("\n\nDisplaying Set : \n");
        System.out.print("{ ");

        for(int i = 0; i < CAPACITY ; i++ ) {
            if(table[i] != null) {

                Entry<K,V> entry = table[i];

                while(entry != null) {

                    System.out.print(entry.key + "");
                    if(i != CAPACITY -  1)
                        System.out.print(" , ");
                    entry = entry.next;
                }
            }
        }

        System.out.println(" }\n\n");

    }



    private int hash(K newKey) {

        return Math.abs(newKey.hashCode()) % CAPACITY;
    }

}
