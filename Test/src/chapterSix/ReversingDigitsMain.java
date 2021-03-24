package chapterSix;

import java.util.Scanner;

public class ReversingDigitsMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = reader.nextInt();
        System.out.println(ReversingDigits.reverseDigits(input));
    }
}
