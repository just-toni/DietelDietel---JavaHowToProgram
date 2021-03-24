package com.Exercises.chapterFour;

import java.util.Scanner;

public class WhatsWrongWithThisCode {
    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);

        System.out.println("1. Enter a number");
        int x = code.nextInt();
        System.out.println("2. Enter a number");
        int y = code.nextInt();
        int sum = x + y;
        System.out.println(++sum);
    }
}
