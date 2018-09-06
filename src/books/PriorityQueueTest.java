package books;

import java.util.PriorityQueue;

/**
 * created by zsj in 21:48 2018/9/5
 * description:
 **/
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(13);
        priorityQueue.add(88);
        System.out.println(priorityQueue);
        priorityQueue.remove(5);
        System.out.println(priorityQueue);

        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("zsj");
        priorityQueue1.add("azsj");
        priorityQueue1.add("czsj");
        priorityQueue1.add("zzsj");
        priorityQueue1.add("ezsj");
        System.out.println(priorityQueue1);
    }
}
