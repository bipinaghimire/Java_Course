package Algorithms.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue_generate_binarynum {

    public static void printBinary(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int front = queue.remove();
            System.out.print(front + " ");
            queue.add(front * 10);
            queue.add(front * 10 + 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(10);
        printBinary(2);
        printBinary(5);
        printBinary(-1);
        printBinary(7);
    }
}
