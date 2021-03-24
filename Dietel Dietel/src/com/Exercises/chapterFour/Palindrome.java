package com.Exercises.chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number (e.g. 12345): ");
        int userInput = scanner.nextInt();
        while (userInput < 10000 || userInput > 99999) {
            System.out.println("wrong input: " +
                    "enter a value between 10000 and 99999");
            userInput = scanner.nextInt();
        }
        boolean isPalindromic = false;
        while (!isPalindromic) {

            int firstNumber = userInput % 10;
            userInput /= 10;
            int secondNumber = userInput % 10;
            userInput /= 10;
            int thirdNumber = userInput % 10;
            userInput /= 10;
            int fourthNumber = userInput % 10;
            userInput /= 10;

            if (firstNumber == userInput && secondNumber == fourthNumber) {
                isPalindromic = true;
                System.out.println("Palindrome!");
            } else {
                isPalindromic = false;
                System.out.println("sorry not palindromic: " +
                        "enter a value between 10000 and 99999");
                userInput = scanner.nextInt();
                while (userInput < 10000 || userInput > 99999) {
                    System.out.println("wrong input: " +
                            "enter a value between 10000 and 99999");
                    userInput = scanner.nextInt();
                }
            }
        }
    }
}
