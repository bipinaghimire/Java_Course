package Algorithms.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueOperation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

        int removedItem = queue.remove();
        System.out.println(removedItem);

        System.out.println(queue);

        while (!queue.isEmpty()) {

            System.out.println(queue.remove());
        }
    }
}
