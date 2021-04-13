package chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class RollDieMain {

    public static void main(String[] args) {
        int[] frequency = new int [7];
        int [] face = new int[6];

        SecureRandom secureRandom = new SecureRandom();
//        System.out.println(secureRandom.nextInt(5));
//        System.out.println(secureRandom.nextInt(5));
//        System.out.println(secureRandom.nextInt(5));
//        System.out.println(secureRandom.nextInt(5));
//        System.out.println(-200 + secureRandom.nextInt(5));
//        System.out.println(-200 + secureRandom.nextInt(5));
//        System.out.println(-200 + secureRandom.nextInt(5));
//        System.out.println(-200 + secureRandom.nextInt(5));
        for (int i = 1; i <= 6_000_000; i++) {
            frequency[1 + secureRandom.nextInt(6)]++;
        }
        System.out.println(Arrays.toString(frequency));

    }

}
