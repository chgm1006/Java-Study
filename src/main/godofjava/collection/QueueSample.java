package godofjava.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by chgm1006 on 2015. 4. 7..
 */
public class QueueSample {
    private void checkLinkedList1() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.addFirst("B");
        System.out.println("link = " + link);

        link.offerLast("C");
        System.out.println("link = " + link);

        link.addLast("D");
        System.out.println("link = " + link);

        link.offer("E");
        System.out.println("link = " + link);

        link.offerLast("F");
        System.out.println("link = " + link);

        link.push("G");
        System.out.println("link = " + link);

        link.offerLast("E");
        System.out.println("link = " + link);

        link.push("G");
        System.out.println("link = " + link);

        link.add(0, "H");
        System.out.println("link = " + link);

        System.out.println("EX = " + link.set(0, "I"));
        System.out.println("link = " + link);

        Map m = Collections.synchronizedMap(new HashMap());
    }

    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();
    }
}
