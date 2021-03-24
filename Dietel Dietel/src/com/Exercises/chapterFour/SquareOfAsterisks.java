package com.Exercises.chapterFour;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.println("Enter number: ");
        int input = scanner.nextInt();
        while (row < input) {
            int column = 0;
            while (column < input) {
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}