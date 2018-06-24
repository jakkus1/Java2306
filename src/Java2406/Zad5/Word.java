package Java2406.Zad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("src/names.txt");
        Scanner sc = new Scanner(file);
        List<String> strings = new ArrayList<>();
        while(sc.hasNext()){
           strings.add(sc.next());

        }

        for(int i = 0; i < strings.size(); i++){
            if(isPalindromList(strings.get(i))){
                System.out.println(strings.get(i));

            }
        }


    }
    public static boolean isPalindromList(String str){
        if(str == null){
            return false;
        }
        for(int i = 0; i < str.length()/2; i++){
            if(!(str.charAt(i) == str.charAt(str.length() - i - 1))){
                return false;
            }
        }
        return true;
    }

}
