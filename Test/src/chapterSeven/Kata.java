package chapterSeven;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;

public class Kata {
    public int[] shuffle(int[] bunch) {
        SecureRandom randomize = new SecureRandom();
        int result = 0;
        for (int i = 0; i < bunch.length; i++) {
            result = randomize.nextInt(bunch.length);
            int first = bunch[result];
            bunch[result] = bunch[i];
            bunch[i] = first;
        }
        return bunch;
    }

    public void sortAsc(int[] bunch) {
        for (int i = 0; i < bunch.length; i++) {
            for (int j = 0; j < bunch[i]; j++) {

            }
        }
    }

    public static void main(String[] args) {
        char[][] tictactoe = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'O','X', 'O'}};
        for(char[] chars : tictactoe){
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i] + " ");
            }
            System.out.println();
        }
    }
}
