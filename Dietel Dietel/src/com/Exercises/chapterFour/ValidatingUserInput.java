package com.Exercises.chapterFour;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int counter = 1;
//                    ;
        while (counter <= 10) {
            System.out.println("Enter result (passes = 1, failures = 2) " + counter);
            int result = input.nextInt();
//            isNotValid = ();

            while (result !=1 && result !=2) {
                System.out.println("Enter result (passes = 1, failures = 2) " + counter);
                result = input.nextInt();
            }
            if (result == 1)
                passes += 1;
            else
                failures += 1;
            counter = counter + 1;
        }

        System.out.printf("Passed: %d%n Failed: %d%n", passes, failures );
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }

}
