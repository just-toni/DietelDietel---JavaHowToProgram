package com.Exercises.chapterThree.DuplicatedCode;

import java.util.Scanner;

public class SentinelWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int total = 0;
//        int gradeCounter = 1;
//        while (gradeCounter <= 10) {
//            System.out.printf("Enter grade %d: ", gradeCounter);
//            int grade = input.nextInt();
//            total = total + grade;
//            gradeCounter = gradeCounter + 1;
//        }
//        int average = total / 10; // integer division yields integer result
//        System.out.printf("%nTotal of all 10 grades is %d%n", total);
//        System.out.printf("Class average is %d%n", average);

//        int count = 1;
//
//        while (++count <= 10) {
//            System.out.println(count % 2 == 1 ? "****" : "++++++++");
//        }

        for (int i = 20; i >= 2; i -= 2) {
            System.out.printf("%d ", i);
        }
    }
}
