package com.Exercises.chapterFive;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int total = 1;
        for (int i = 1; i <= 15; i += 2){
            System.out.print(total + " * " + i + " = ");
            total *= i;
            System.out.println(total);
        }
    }
}
