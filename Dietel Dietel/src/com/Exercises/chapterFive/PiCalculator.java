package com.Exercises.chapterFive;

public class PiCalculator {
    public static void main(String[] args) {

        System.out.println("Number\t\tPI");
        int limit = 200_000;

        int denominator = 1;
        double piValue = 0.0;

        for(int i = 1; i <= limit; i++) {
            if (i % 2 == 1) {
                piValue += 4.0 / denominator;
            } else {
                piValue -= 4.0 / denominator;
            }
//            if((int)(piValue * 100000) == 314159){
//                value = i;
//            }
            denominator += 2;
            System.out.println(i + "\t\t\t" + piValue);
        }
    }
}
