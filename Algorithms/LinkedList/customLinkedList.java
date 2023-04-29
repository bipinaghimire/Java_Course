package Algorithms.LinkedList;

public class customLinkedList {
    Node head;

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println();
    }

    // delete th eback half of the linked list
    public void deleteBackHalf() {
        if (head == null || head.next == null) {
            head = null;
        }
        Node current = head;
        Node prev = null;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    // delete kth node from the end of the list
    public void deleteKthNode(int k) {
        if (head == null || head.next == null) {
            head = null;
        }
        Node current = head;
        Node prev = null;
        Node fast = head;
        int count = 0;
        while (count < k) {
            fast = fast.next;
            count++;
        }
        while (fast != null) {
            fast = fast.next;
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }
}
