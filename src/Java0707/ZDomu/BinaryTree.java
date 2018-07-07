package Java0707.ZDomu;

public class BinaryTree {

    private Node root;

    BinaryTree (Node node) {
        this.root = node;
    }

    void showTree (DfsType dfsType) {
        System.out.print(dfsType.name() + ": ");
        dfsType.showTree(root);
        System.out.println();
    }

}

