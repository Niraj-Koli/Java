package Queues;

import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(7);
        queue.add(21);
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.size());

        queue.remove();
        queue.remove();

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);
    }
}
