package com.Exercises.chapterFive;

public class Factorials {
    public static void main(String[] args) {
//        int number = 1;
        long factorial = 1;

        System.out.println("Number\t\t\tFactorial");

        for(int i = 1; i <= 20; i++){
            factorial *= i;
            System.out.println(i + "\t\t\t\t" + factorial);
        }

    }
}
