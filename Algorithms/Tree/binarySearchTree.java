package Algorithms.Tree;

public class binarySearchTree {
    NodeB root;

    public void insert(int value) {
        insert(this.root, value);
    }

    private NodeB insert(NodeB root, int value) {
        if (root == null) {
            root = new NodeB();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            // insert on right
            root.right = insert(root.right, value);
        }

        return root;
    }
}
