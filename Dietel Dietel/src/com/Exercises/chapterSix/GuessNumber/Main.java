package com.Exercises.chapterSix.GuessNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GuessNumber guess = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        guess.generateRandomNumber();
        int input = 0;

        System.out.println("Enter a number: ");
        input = scanner.nextInt();
        System.out.println(guess.guessTheNumber(input));

//        System.out.println("Enter 0 to play again");
//        if (input== 0){
            while(input != guess.getRandomNumber()){
                System.out.println("Enter a number: ");
                input = scanner.nextInt();
                System.out.println(guess.guessTheNumber(input));
            }
//        }
    }
}
