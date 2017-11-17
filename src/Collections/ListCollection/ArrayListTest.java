package Collections.ListCollection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Prashant on 11-10-2017.
 */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        System.out.println("ListCollection size() : " + list.size());

        list.add("Prashanat");
        list.add("Sparsh");
        list.add("Shraddha");
        list.add("Ajit");

        System.out.println("ListCollection size() : " + list.size());

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
