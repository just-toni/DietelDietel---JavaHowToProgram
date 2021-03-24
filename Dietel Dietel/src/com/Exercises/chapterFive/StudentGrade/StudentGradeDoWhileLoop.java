package com.Exercises.chapterFive.StudentGrade;

import java.util.Scanner;

public class StudentGradeDoWhileLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        int total = 0;
        double average = 0.0;
        double score = 0;

        do {
            System.out.println("Enter a grade: ");
            score = reader.nextDouble();

        if (score >= 0 && score <= 100){
            total += score;
            average = total / counter;
        }else
            System.out.println("Invalid input");

            counter++;
        }
        while(counter <= 10);
        System.out.println(total);
        System.out.println(average);

    }
}
