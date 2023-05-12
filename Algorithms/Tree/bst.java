package Algorithms.Tree;

public class bst {
    public static void main(String[] args) {
        NodeB rootNode = new NodeB();
        rootNode.data = 2;

        binarySearchTree tree = new binarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(4);
        tree.insert(2);
    }
}
