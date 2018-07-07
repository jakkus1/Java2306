package Java0707.BinaryTree;


public class NewTree {
    private Node1 root;

    NewTree (Node1 node) {
        this.root = node;
    }

    public static void visit (Node1 node) {
        System.out.println(node.getValue());
    }

    public void showTreePostOrder (Node1 node) {
        if (node != null) {
            showTreePostOrder(node.getLeft());
            showTreePostOrder(node.getRight());
            visit(node);
        }
    }


}

