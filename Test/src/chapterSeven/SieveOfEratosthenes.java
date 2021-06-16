package chapterSeven;

import java.util.Arrays;

public class SieveOfEratosthenes {

    static boolean[] array = new boolean[1000];

    public static void isPrime() {
        for (int i = 2; i < array.length; i++) {
            array[i] = true;
            System.out.print(i + " ");
        }
//        for (int i = 2; i < array.length; i++) {
//            if(i % 2 == 0) return false;
//            if(array[i] == true){
//
//            }
//        }
//        return true;
    }

    public String displayArray(){
        isPrime();
        return Arrays.toString(array);
    }

}
