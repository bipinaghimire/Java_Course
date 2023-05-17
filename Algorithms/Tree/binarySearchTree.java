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

    // checking whether the tree contains the value or not
    public boolean contains(int value) {
        return contains(this.root, value);
    }

    private boolean contains(NodeB root, int value) {
        if (root == null) {
            return false;
        } else if (value == root.data) {
            return true;
        } else if (value < root.data) {
            return contains(root.left, value);
        } else {
            return contains(root.right, value);
        }
    }
}
