package chapterSix;

import java.util.Scanner;

public class FactorsOfNumbersMain {
    public static void main(String[] args) {
        Factors factors = new Factors();
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = reader.nextInt();

        System.out.printf("Factors of %d are: %s", input, factors.findFactorsOfANUmber(input));
    }
}
