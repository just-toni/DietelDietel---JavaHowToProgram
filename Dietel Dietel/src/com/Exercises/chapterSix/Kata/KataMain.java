package com.Exercises.chapterSix.Kata;

import java.util.Scanner;

public class KataMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= input; j++){
                if(i * j == input){
                    System.out.println(i + "\t\t\t" + j);
                }
            }
        }
    }
}
