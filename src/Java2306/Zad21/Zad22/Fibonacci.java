package Java2306.Zad21.Zad22;

public class Fibonacci {
int fibonacci(int n){
    if(n == 0){
        return 0;
    }else if (n == 1 || n == 2){
        return 1;
    }else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
}
