package Collections.ListCollection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by Prashant on 11-10-2017.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Prashant");
        queue.add("Ajit");
        queue.add("Ganesh");
        queue.add("Sameer");

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        queue.remove();

        Iterator iterator1 = queue.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}
