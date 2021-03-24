package com.Exercises.chapterFive.StudentGrade;

import java.util.Scanner;

public class StudentGradeForLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        int total = 0;
        double average = 0.0;
        double score = 0;

        for(; counter <= 3; ) {
            System.out.println("Enter a grade: ");
            score = reader.nextDouble();
            if (score >= 0 && score <= 100) {
                total += score;
                average = total / counter;
            } else
                System.out.println("Invalid input");

            counter++;

        }
        System.out.println(total);
        System.out.println(average);
    }
}
