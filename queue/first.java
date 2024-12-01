package queue;
import java.util.*;

public class first {
    public static void main(String[] args) {
            
            Queue<Integer> queue = new LinkedList<>();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);
    
            System.out.println(queue.peek()); //returns the head of the queue
            System.out.println(queue.remove());
            System.out.println(queue.poll()); //removes the head of the queue
            System.out.println(queue);

            Deque<Integer> deque = new ArrayDeque<>(); //Double ended queue with array implementation and it is faster than LinkedList
            deque.addFirst(10);
            deque.addFirst(20);
            deque.addLast(30);
            deque.addLast(40);
            deque.addFirst(50);
            System.out.println(deque);

            deque.removeFirst();
            deque.removeLast();
            System.out.println(deque);



    }
    
}
