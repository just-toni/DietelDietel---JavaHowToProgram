package chapterNine;

import java.util.Arrays;

public class Bus extends Vehicle{


    public static void main(String[] args) { String one = args[0]; Arrays.sort(args);

        int result = Arrays.binarySearch(args, one); System.out.println(result);
    }

}
