package chapterSix;

import java.util.Scanner;

public class SquareOfAsterisksMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = reader.nextInt();
        SquareOfAsterisks.setFirstInput(input);

        System.out.println(SquareOfAsterisks.squareOfAsterisks(SquareOfAsterisks.getFirstInput()));
    }
}
