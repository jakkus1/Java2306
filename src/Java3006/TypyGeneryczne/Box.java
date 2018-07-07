package Java3006.TypyGeneryczne;

public class Box <T, S>{
    private T element;
    private S number;

    public Box (T element, S number){
            this.element = element;
            this.number = number;
    }

    public T getElement(){
        return element;
    }
    public S getNumber(){
        return number;
    }

    @Override
    public String toString () {
        return "Box{" +
                "element=" + element +
                ", number=" + number +
                '}';
    }
}
