package Java0107;

public class Node {

       private String value;
        private Node lesftChild;
        private Node rightChild;

        public Node (String value, Node lesftChild, Node rightChild) {
            this.value = value;
            this.lesftChild = lesftChild;
            this.rightChild = rightChild;
        }

    public String getValue () {
        return value;
    }

    public Node getLesftChild () {
        return lesftChild;
    }

    public Node getRightChild () {
        return rightChild;
    }
}
