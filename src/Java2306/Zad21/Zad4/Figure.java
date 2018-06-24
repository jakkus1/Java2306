package Java2306.Zad21.Zad4;

public class Figure {
    public static void main (String[] args) {
    figure3(7);
    }
    static void figure1(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++ ){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void figure2(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                if(j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void figure3 (int n){
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
