package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueOperation {
    // |mN|...|m3|m2|m1|
    Queue<String> messages = new ArrayDeque<>();       // kolejka jednokierunkowa

    public void addMessage(String content){
        messages.add(content);          // dodaje element na koniec kolejki
    }
    public void showMessages(){
        messages.forEach(System.out::println);
    }
    public String removeElement(){
        try {
            return messages.remove();          // usuwa element z początku kolejki
        } catch (NoSuchElementException e){
            return "kolejka jest już pusta!";
        }
    }

    public static void main(String[] args) {
        QueueOperation q = new QueueOperation();
        q.addMessage("M1");
        q.addMessage("M2");
        q.addMessage("M3");
        q.addMessage("M4");
        q.showMessages();
        System.out.println("==================");
        System.out.println(q.removeElement());
        q.addMessage("Nowy");
        System.out.println(q.removeElement());
        System.out.println(q.removeElement());
        System.out.println(q.removeElement());
        System.out.println(q.removeElement());
        System.out.println(q.removeElement());
    }
}
