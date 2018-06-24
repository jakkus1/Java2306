package Java2306.Zad21;

public class Zad21Rekurencja {

    int factorial (int n) {
        if (n == 1 || n == 0) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }

    }

}





