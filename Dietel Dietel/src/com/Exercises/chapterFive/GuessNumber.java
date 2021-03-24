package com.Exercises.chapterFive;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int guessNumber = 567;
        int input;

        System.out.println("Enter a number");
        input = reader.nextInt();

        while (input != guessNumber){
            System.out.println("Wrong number guessed, please try again!");
            System.out.println("Enter a number");
            input = reader.nextInt();
        }

        while (input == guessNumber){
            System.out.println("Guessed correctly!!!");
            break;
        }
    }
}
