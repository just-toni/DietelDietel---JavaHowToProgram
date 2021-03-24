package com.Exercises.chapterSix.Kata;

import java.util.Scanner;

public class KataRandomizer2Test {
    public static void main(String[] args) {

        KataRandomizer2 kata2 = new KataRandomizer2();
        Scanner scanner = new Scanner(System.in);

        int numberOfQuestion = 1;
        for(int i = 1; i <= 10; i++){
            System.out.println("Question " + numberOfQuestion);

            kata2.setFirstRandomNumber();
            kata2.setSecondRandomNumber();
            kata2.setThirdRandomNumber();
            kata2.generateRandomFirstOperators();
            kata2.generateRandomSecondOperators();
            kata2.getFirstResult();
            kata2.getSecondResult();

            System.out.println(kata2.getQuestion());
            int input = scanner.nextInt();

            kata2.confirmInput(input);
            numberOfQuestion++;
            System.out.println();
        }

        System.out.println("Your score is " + kata2.getTotalScore());
    }
}
