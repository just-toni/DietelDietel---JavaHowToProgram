package com.Exercises.chapterThree.DuplicatedCode;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int studentCounter = 0;

        while (studentCounter < 10) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1){
                if (result < 1 || result > 1){
                    System.out.println("Invalid Input");
                }
                // fix a range that if greater than 1 or less than 1 print invalid input
                else{
                    if (result < 2 || result > 2);
                    System.out.println("Invalid input");
                }
                ++ fail;
                // fix a range that if greater than 2 or less than 2 print invalid input
                ++ studentCounter;
            }
                pass =+ 1;

        }

        System.out.printf("Passed: %d%n Failures: %d%n ", pass, fail );

        if (pass > 8);
        System.out.println("Bonus to instructor!");

    }

}
// how can i print invalid input after the user inputed the wrong thing.
