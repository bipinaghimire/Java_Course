package Algorithms.Stack;

import java.util.Stack;

public class next_greater {
    public static void printNextGreater(int[] arr) {
        if (arr.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            int next = arr[i];
            if (!stk.isEmpty()) {
                int popped = stk.pop();
                while (popped < next) {
                    System.out.println(popped + " -->" + next);
                    if (stk.isEmpty()) {
                        break;
                    }
                    popped = stk.pop();
                }
                if (popped > next) {
                    stk.push(popped);
                }
            }
            stk.push(next);
        }

        while (!stk.isEmpty()) {
            System.out.println(stk.pop() + " --> " + -1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 16, 7, 2, 15 };
        printNextGreater(arr);
    }
}
