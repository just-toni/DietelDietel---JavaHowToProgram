package com.Exercises.chapterFour;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner toni = new Scanner(System.in);

        int counter = 1;
        int number = 0;
        int largestNumber = 0;
//        int temp = 0;

        while (counter <= 10) {
            System.out.println("Enter a number: ");
            number = toni.nextInt();
            if (largestNumber < number) {
                largestNumber = number;
            }
            counter += 1;
        }

        System.out.printf("The largest number is: %d%n", largestNumber);
    }
}
