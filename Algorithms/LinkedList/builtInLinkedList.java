package Algorithms.LinkedList;

public class builtInLinkedList {
    // public static void main(String[] args) {
    // LinkedList<String> listy = new LinkedList<>();
    // listy.add("Hello");
    // listy.add("World");
    // listy.add("This");
    // listy.add("is");
    // listy.add("a");
    // listy.add("LinkedList");

    // System.out.println(listy);

    // System.out.println(listy.contains("Hello"));

    // listy.removeFirst();

    // for (String item : listy) {
    // System.out.print(item + "-->");
    // }
    // }

    // custom linked list

    public static void main(String[] args) {
        customLinkedList linkedlist = new customLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(7);

        linkedlist.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedlist.displayContents();
        // delete th eback half of the linked list

        linkedlist.deleteBackHalf();
        linkedlist.displayContents();

        // delete kth node from the end of the list
        linkedlist.deleteKthNode(2);
        linkedlist.displayContents();

    }
}