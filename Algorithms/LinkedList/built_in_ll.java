package Algorithms.LinkedList;

public class built_in_ll {
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
        custom_ll linkedlist = new custom_ll();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(7);

        linkedlist.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedlist.displayContents();

    }
}