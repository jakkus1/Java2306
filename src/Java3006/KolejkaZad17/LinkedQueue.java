package Java3006.KolejkaZad17;

import java.util.NoSuchElementException;


    public class LinkedQueue<T> {

        private int n; //rozmiar Koljki - ilość elementów w Kolejce
        private Node first; // początek kolejki
        private Node last; //koniec kolejki


        private class Node { //pomocna klasa Linkedlisty
            private T t;
            private Node next;
        }

        public LinkedQueue () { //inicjalizacja pustej Kolejki
            first = null;
            last = null;
            n = 0;
        }

        public boolean isEmpty () { // sprawdzenie, czy Kolejka jest pusta
            return first == null;
        }

        public int size () { // zwracanie ilości elementów w Kolejce
            return n;
        }

        public void push (T t) { // dodanie elementu do Kolejki
            Node oldLast = last;
            last = new Node();
            last.t = t;
            last.next = null;
            if (isEmpty()) {
                first = last;
            } else{
                oldLast.next = last;
            }
                n++;

        }


        public T pop () { // usuwanie i zwracanie elementu, który był dodany jako pierwszy
            if (isEmpty()) throw new NoSuchElementException("Queue underflow");
            T t = first.t;
            first = first.next;
            n--;
            if (isEmpty()){
                last = null;
            }
            return t;

        }

        public T front () { // Zwracanie elementu jako pierwszego dodanego do Kolejki
            if (isEmpty()) throw new NoSuchElementException("Queue underflow");
            return first.t;

        }


    }
