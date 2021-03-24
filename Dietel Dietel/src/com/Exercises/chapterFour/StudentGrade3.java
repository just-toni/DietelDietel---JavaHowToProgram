package com.Exercises.chapterFour;

import java.util.Scanner;

public class StudentGrade3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        int total = 0;
        while (counter <= 10) {
            System.out.println("Enter a grade");
            counter = reader.nextInt();
            if (counter >= 0 && counter <= 100) {
                total = total + counter;
                counter++;
            }
            else {
                System.out.println("Invalid input entered for grade");
            }
        }
        double average = total / 10.0;
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);

    }
}
