package Java0707.BinaryTree;

public class Node1 {
    private String value;
    private Node1 left;
    private Node1 right;

    public Node1 (String value, Node1 left, Node1 right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getValue () {
        return value;
    }

    public Node1 getLeft () {
        return left;
    }

    public Node1 getRight () {
        return right;
    }
}
