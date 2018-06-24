package Java2306.Zad21.Zad3;

public class Log1 {
    public static void main (String[] args) {
        alg3(10);
    }
    static void alg1(int n){
        for(int i = 1; i < n*2 ; i+=2){
            System.out.print(i + ", ");

        }
    }
    static void alg2(int n){
        int b = -2;
        for(int i = 0; i < n; i++){
            b = b*2 + 3;
            System.out.print(b + ", ");
        }
    }

    static void alg3(int n){
        boolean direction = true;
        int result = 2;
        for(int i = 0; i< n; i++ ){
            System.out.print(result + ", ");
            if(direction){
                result+= 2;

            }else{
                result-=2;
            }
            if (result == 8 || result == 2){
                direction = !direction;
            }
        }
    }

}
