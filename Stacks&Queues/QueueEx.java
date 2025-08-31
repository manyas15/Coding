
import java.util.*;


public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
