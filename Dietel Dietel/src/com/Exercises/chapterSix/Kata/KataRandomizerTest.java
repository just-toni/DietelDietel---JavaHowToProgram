package com.Exercises.chapterSix.Kata;

import java.util.Scanner;

public class KataRandomizerTest {
    public static void main(String[] args) {

        KataRandomizer kata = new KataRandomizer();
        Scanner scanner = new Scanner(System.in);

        int numberOfQuestion = 1;
        for(int i = 1; i <= 10; i++){
            System.out.println("Question " + numberOfQuestion);

            kata.setFirstRandomNumber();
            kata.setSecondRandomNumber();
            kata.generateRandomOperators();
            kata.getResult();

            System.out.println(kata.getQuestion());
            int input = scanner.nextInt();

            kata.confirmInput(input);
            numberOfQuestion++;
            System.out.println();
        }

        System.out.println("Your score is " + kata.getTotalScore());
    }
}
