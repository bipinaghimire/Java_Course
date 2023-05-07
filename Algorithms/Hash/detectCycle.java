package Algorithms.Hash;

import java.util.HashSet;

import Algorithms.LinkedList.Node;

public class detectCycle {
    Node head;

    public boolean hasCycle() {
        // using hash
        HashSet<Node> set = new HashSet<>();
        Node current = head;
        while (current != null) {
            if (set.contains(current)) {
                return true;
            } else {
                set.add(current);
            }

            current = current.next;
        }
        return false;
    }
}

// if (head == null || head.next == null) {
// return false;
// }
// Node slow = head;
// Node fast = head.next;
// while (slow != fast) {
// if (fast == null || fast.next == null) {
// return false;
// }
// slow = slow.next;
// fast = fast.next.next;

// }
// return true;
