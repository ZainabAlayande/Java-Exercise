package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {
        Queue<Integer> queues = new PriorityQueue<>();
        queues.add(1);
        queues.add(2);
        queues.add(3);
        queues.add(4);

        queues.poll();
        System.out.println(queues);

    }
}
