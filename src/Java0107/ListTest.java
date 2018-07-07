package Java0107;

public class ListTest {
    public static void main (String[] args) {
    List list = new List();
        System.out.println("Lista jest pusta: " + list.isEmpty());
        list.add(3);
        list.add(4);
        System.out.println("Rozmiar listy : " + list.getSize());
        System.out.println("Element pod indexem 0: " + list.getElement(0));
        list.add(5);
        list.add(6);
        System.out.println("Element pod indexem 1: " + list.getElement(1));
        System.out.println("Element pod indexem 2: " + list.getElement(2));
        list.add(2,0);
        System.out.println("Element pod indexem 2: " + list.getElement(2));
        list.add(0,1);
        System.out.println("");

    }
}
