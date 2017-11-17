package Collections.ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Prashant on 11-10-2017.
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
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
