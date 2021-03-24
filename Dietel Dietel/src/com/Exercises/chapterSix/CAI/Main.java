package com.Exercises.chapterSix.CAI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CAI1 cai1 = new CAI1();
        Scanner scanner = new Scanner(System.in);

        int numberOfQuestions = 1;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Question " + numberOfQuestions);

            cai1.generateRandomNumber();
            System.out.println(cai1.getQuestion());
            int input = scanner.nextInt();

            System.out.println(cai1.getStudentFeedback());
            numberOfQuestions++;
            System.out.println();

        }
//        int[] c = new int[3];
//        System.out.println(c);
//
//        CAI1 cai1 = new CAI1();
//        System.out.println(cai1);
    }
}
