package Algorithms.LinkedList;

public class custom_ll {
    Node head;

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println();
    }
}
