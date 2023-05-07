package Algorithms.Hash;

import Algorithms.LinkedList.Node;
import Algorithms.LinkedList.customLinkedList;

public class detectCycleLL {
    public static void main(String[] args) {
        customLinkedList ll = new customLinkedList();
        Node first = new Node(3);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(6);

        ll.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        System.out.println(ll.hasCycle());

        customLinkedList cycleLL = new customLinkedList();
        cycleLL.head = first;
        third.next = second;
        System.out.println(cycleLL.hasCycle());
    }

}
