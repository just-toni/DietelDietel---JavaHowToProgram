package com.Exercises.chapterFour.Kata;

public class KataTest {
    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.printf("The average is: %.2f%n", kata.calculateAverage(1,2,3));

        System.out.printf("The sum is %.2f%n", kata.sum(3,4,5));

        System.out.printf("The grade is %s%n", kata.calculateGrade(69));

        System.out.printf("The number is even: %b%n", kata.calculateEven(4));

//        System.out.printf("The number is a prime number: %b", kata.isPrimeNumber(11));
    }
}
