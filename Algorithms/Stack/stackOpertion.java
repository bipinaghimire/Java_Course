package Algorithms.Stack;

import java.util.Stack;

public class stackOpertion {

    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        System.out.println("start main");
        stk.push("main");
        System.out.println("start builder");
        stk.push("builder");
        System.out.println("start external-service");
        stk.push("external-service");
        System.out.println(stk.pop());
        System.out.println("start parse-external-data");
        stk.push("parse-external-data");
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

        // stack.peek(); look into the top item of stack without removing it
    }
}
