package Java3006.KolejkaZad17;

public class SlackTest3 {
    public static void main (String[] args) {
      LinkedQueue queue = new LinkedQueue();
        System.out.println("Kolejka jest pusta " + queue.isEmpty());
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        System.out.println("Wielkość kolejki " + queue.size());
        System.out.println("Pierwszy element dodany do kolejki " + queue.front());
        System.out.println("Usunięto pierwszy element: " + queue.pop());
        System.out.println("Wielkość kolejki " + queue.size());
        System.out.println("Kolejka jest pusta " + queue.isEmpty());
    }

}
