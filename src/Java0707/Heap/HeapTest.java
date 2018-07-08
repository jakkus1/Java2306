package Java0707.Heap;

public class HeapTest {
    public static void main (String[] args) {
        Heap heap = new Heap(5);
        heap.add(22);
        heap.add(6);
        heap.add(8);
        heap.add(12);
        heap.add(2);
        System.out.println(heap);
        heap.remove(0);
        System.out.println(heap);

    }
}
