package Algorithms.Tree;

public class bst {
    public static void main(String[] args) {
        NodeB rootNode = new NodeB();
        rootNode.data = 2;

        binarySearchTree tree = new binarySearchTree();
        tree.root = rootNode;

        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);

        treetraversal treetraverse = new treetraversal();
        treetraverse.preOrdertraversal();
        System.out.println();
        treetraverse.inOrdertraversal();
        System.out.println();
        treetraverse.postOrdertraversal();

        System.out.println("Printingwhetner the value contains in tree or not");
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(5));
        System.out.println(tree.contains(7));
    }
}
