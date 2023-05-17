package Algorithms.Tree;

// this is not for binary search tree instead its for binary tree only
public class treetraversal {
    NodeB root;

    public void preOrdertraversal() {
        preOrdertraversal(this.root);
    }

    private void preOrdertraversal(NodeB root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preOrdertraversal(root.left);
        preOrdertraversal(root.right);
    }

    public void inOrdertraversal() {
        inOrdertraversal(this.root);
    }

    private void inOrdertraversal(NodeB root) {
        if (root == null) {
            return;
        }

        inOrdertraversal(root.left);
        System.out.println(root.data);
        inOrdertraversal(root.right);
    }

    public void postOrdertraversal() {
        postOrdertraversal(this.root);
    }

    private void postOrdertraversal(NodeB root) {
        if (root == null) {
            return;
        }

        postOrdertraversal(root.left);
        postOrdertraversal(root.right);
        System.out.println(root.data);
    }
}
