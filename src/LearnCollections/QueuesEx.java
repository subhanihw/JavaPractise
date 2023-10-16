package LearnCollections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesEx {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>(new StringLengthComparator());
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("Sasuke", "Tobi", "NET"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
