package com.Exercises.chapterFive;

import java.util.Scanner;

public class ModifiedDiamond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if((number > 1 && number <= 19) && number % 2 == 1) {
            int spaces = number;
            int stars = 1;
            int lines = number;
            int div = lines / 2 + 1;
            for (int i = 0; i <= lines; i++) {
                for (int a = spaces; a > 0; a--) {
                    System.out.print(" ");
                }
                for (int b = stars; b > 0; b--) {
                    System.out.print("* ");
                }
                System.out.println();
                if (i < div) {
                    spaces -= 2;
                    stars += 2;
                } else if (i >= div) {
                    spaces += 2;
                    stars -= 2;
                }
            }
        }
    }

}
