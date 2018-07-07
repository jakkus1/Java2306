package Java2406.Zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Algorithm {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("src/numbers.txt");
        Scanner sc = new Scanner(file);
        List<Integer> integers = new ArrayList<>();
        while (sc.hasNext()) {
            if( sc.hasNextInt()){
                integers.add(sc.nextInt());

        }

            }
            for(int i = 0; i < integers.size(); i++) {
               System.out.println(num(integers));
            }
        }
        public static int num (List<Integer> integers){
        int num = 0;

        for(int i = 0; i < integers.size(); i++) {
            if(integers.size() == 0 ){
                return 0;
            }else{
            num = integers.get(i) + (integers.get(i - 1) );
        }


        }
        return num;
    }
    }







