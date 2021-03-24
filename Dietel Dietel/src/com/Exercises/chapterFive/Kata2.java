package com.Exercises.chapterFive;

import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int min;
        int max;
        int input;

        System.out.println("Enter a number: ");
        min = max = reader.nextInt();

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter a number: ");
            input = reader.nextInt();
            if(input > max){
                max = input;
            }
            if(input < min){
                min = input;
            }
        }

        System.out.println("The maximum number is " + max);
        System.out.println("Then minimum number is " + min);
    }
}
