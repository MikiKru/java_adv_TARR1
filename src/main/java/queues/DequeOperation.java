package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.TreeSet;

public class DequeOperation {
    public static void main(String[] args) {
        Deque<String> elements = new ArrayDeque<>();

        elements.addLast("M1");
        elements.addFirst("M2");
        elements.addLast("M3");
        elements.addFirst("M4");
        elements.addLast("M5");
        elements.addFirst("M6");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");
        elements.addFirst("M7");

        elements.forEach(System.out::println);
        System.out.println(elements.size());
//
//        System.out.println("USUWANIE");
//        System.out.println(elements.removeFirst());
//        System.out.println(elements.removeLast());
//        System.out.println("ODCZYT");
//        System.out.println(elements.getFirst());
//        System.out.println(elements.getLast());
//        System.out.println("Czy jeszcze został element M2? " + elements.contains("M2"));
//        System.out.println("Czy jeszcze został element M2? " + elements.contains("M7"));

    }
}
