package Java0107;

public class List<T> {


    private int n; //rozmiar Listy - ilość elementów w Liście
    private Node head; // początek Listy
    private Node tail; //koniec Listy
    private Node temp; //obecny element Listy


    public List () { //inicjalizacja pustej Listy
        head = null;
        tail = null;
        temp = null;
        n = 0;

    }


    public boolean isEmpty () { // sprawdzenie, czy Lista jest pusta
        return head == null;
    }

    public int getSize () { // zwracanie ilości elementów w Liście
        return n;
    }

    public void add (T t) { // dodawanie elementu do Listy
        Node oldTail = tail;
        tail = new Node(t);

        if (isEmpty()) {
            head = tail;
        } else {
            oldTail.next = tail;
            tail.previous = oldTail;
        }
        n++;
    }

    public void add (int index, T t) {
        if(index == getSize()){
            add(t);
            return;
        }else if(isEmpty() || index < 0 || index > getSize()){
            throw new IndexOutOfBoundsException();
        }
        else if(index == 0){
            Node temp = new Node(t);
            temp.t = t;
            temp.next = head;
            head.previous = temp;
            head = temp;
            n++;
            return;
        }
        temp = head;
        for( int i = 0; i < index - 1; i++) temp = temp.next;
        Node myNode = new Node(t);
        myNode.t = t;
        myNode.next = temp.next;
        temp.next = myNode;
        n++;


    }

    /*public T remove (int index) {

    }*/

    public T getElement (int index) { //wyświetlenie elementu z Listy
        if ( index >= 0 && index < getSize()){
                temp = head;
        for(int i = 0; i < index; i++) temp = temp.next;
        return temp.t;}
        else {
            throw new IndexOutOfBoundsException();
        }

    }


    private class Node { //pomocna klasa List
        private T t;
        private Node next;
     private Node previous;

        public Node (T t) { //konstruktor Node
            this.t = t;
            this.next = null;
            this.previous = null;

        }
    }
}
