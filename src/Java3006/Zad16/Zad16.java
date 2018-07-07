package Java3006.Zad16;


import java.util.EmptyStackException;


public class Zad16<T> {

    private T []stack;
    private T top;
    private Integer size;

    public Zad16 (Integer size) {
        this.stack = (T[]) new Object[size];
        this.size = 0;
    }

    public void push(T element){
        if(size != stack.length) {
            stack[size++] = element;
            top = element;
        }else {
            System.out.println("Stos został zapełniony! Nie można dodaćkolejnego elementu!");
        }
    }

    public int peek(){
        if(!isEmpty()) {
            return (Integer)top;
        }else{
            throw new EmptyStackException();
        }
    }

    public Integer pop(){

        if(!isEmpty()) {
            size--;

            if(size  == 0) {
                top = null;

                return (Integer) stack[size];
            }
            top = stack[size - 1];
            return (Integer)stack[size];
        }else{
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty(){
        return  size == 0;
    }


}
