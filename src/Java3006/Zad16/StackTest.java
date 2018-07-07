package Java3006.Zad16;

public class StackTest {
    public static void main (String[] args) {
        Zad16 stack = new Zad16(5);

        System.out.println("Is empty: " + stack.isEmpty());
        stack.push(9);
        System.out.println("Is Empty: " + stack.isEmpty());
        stack.push(4);
        stack.push(7);
        stack.push(232);
        stack.push(11);
        System.out.println(stack.peek());
        stack.push(33);

       /* Box<String, Integer> box = new Box<>("Jakus tekst", 15);
        Box <Integer, Person> box2 = new Box <>(172, new Person("Bolek", 15));
        Box<Person, Integer> box3 = new Box<>(new Person("Janek", 25), 28);*/


    }
}
