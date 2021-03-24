package com.Exercises.chapterFive;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String store = "";
        System.out.println("Enter a decimal value");
        int input = scan.nextInt();

        if(input % 2 == 1){
            while (input != 0) {
                int rem = input % 2;
                store = store + rem;
                input = input / 2;
            }
            System.out.println(store);
        }
    }
}
