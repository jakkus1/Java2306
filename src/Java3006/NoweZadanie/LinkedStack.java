package Java3006.NoweZadanie;


import java.util.NoSuchElementException;


public class LinkedStack<T>  {

    private int count; //rozmiar Stosu
    private Node top; //ostatni element Stosu



    private class Node{ //pomocna klasa Linkedlisty
        private T t;
        private Node next;
    }
    public LinkedStack(){ //inicjalizacja pustego Stosu
        top = null;
        count = 0;
    }
    public boolean isEmpty(){ // sprawdzenie, czy Stos jest pusty
        return top == null;
    }

    public int size(){ // zwracanie ilości elementów w Stosie
        return count;
    }

    public void push (T t){ // dodanie elementu do Stosu
        Node oldTop = top;
        top = new Node();
        top.t = t;
        top.next = oldTop;
        count++;

    }



    public T pop(){ // usuwanie i zwracanie ostatnio dodanego elementu
        if(isEmpty()) throw new NoSuchElementException("Stack underflow");
        T t =top.t;
        top = top.next;
        count--;
        return t;

    }

    public T peek(){ // Zwracanie, ale nie usuwanie ostatniego elementu w Stosie
        if(isEmpty()) throw new NoSuchElementException ("Stack underflow");
        return top.t;
    }


    }




