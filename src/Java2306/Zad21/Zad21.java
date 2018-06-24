package Java2306.Zad21;

public class Zad21 {
    public static void main (String[] args) {
        int number = 10;

        int result = 1;
        for(int i = 1; i<=number; i++){
            result = result *i;
        }
        System.out.printf("factorial = %d", result);


    }
}
