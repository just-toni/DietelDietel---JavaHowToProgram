package com.Exercises.chapterFour;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        int odd = 0;
        System.out.println("Even\tOdd");
        while(odd <= 100){
            if (odd % 2 == 1) {
                System.out.printf(" \t\t%d%n", odd);
            } else{
                System.out.printf("%d", odd);
            }
            odd ++;
        }
    }

}
