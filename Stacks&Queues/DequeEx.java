import java.util.*;
public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(4);
        deque.addLast(5);
        deque.addFirst(1);
        
        System.out.println(deque);
    }
}
