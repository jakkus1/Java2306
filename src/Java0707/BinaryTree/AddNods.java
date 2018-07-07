package Java0707.BinaryTree;

public class AddNods {
    public static void main (String[] args) {
        Node1 a = new Node1("A", null, null );
        Node1 c = new Node1("C", null, null);
        Node1 e = new Node1("E", null, null);
        Node1 h = new Node1("H", null, null);
        Node1 d = new Node1("D", c, e);
        Node1 i = new Node1("I", h, null);
        Node1 b = new Node1("B", a, d);
        Node1 g = new Node1("G", null, i);
        Node1 root = new Node1("F", b, g);

        NewTree tree = new NewTree(root);
        tree.showTreePostOrder(root);

    }
}
