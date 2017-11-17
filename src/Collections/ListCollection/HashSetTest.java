package Collections.ListCollection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Prashant on 11-10-2017.
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Prashant");
        hset.add("Sparsh");
        hset.add("Shraddha");

        Iterator iterator = hset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
