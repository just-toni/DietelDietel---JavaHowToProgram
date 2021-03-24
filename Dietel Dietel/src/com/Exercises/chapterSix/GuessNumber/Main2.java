package com.Exercises.chapterSix.GuessNumber;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        GuessNumber2 guess2 = new GuessNumber2();
        Scanner scanner = new Scanner(System.in);
        guess2.generateRandomNumber();
        int input = 0;
        int count = 0;

        System.out.println("Enter a number: ");
        input = scanner.nextInt();
        System.out.println(guess2.guessTheNumber(input));

        while (count >= 0) {
            while (input != guess2.getRandomNumber()) {
                System.out.println("Enter a number: ");
                input = scanner.nextInt();
                System.out.println(guess2.guessTheNumber(input));
                count++;
                System.out.println(guess2.displayMessage());
            }
        }

    }

}
