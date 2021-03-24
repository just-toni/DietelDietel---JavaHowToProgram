package com.Exercises.chapterFive;

public class ModifiedCompoundInterestTwo {
    public static void main(String[] args) {

        double amount;
        double principal = 1000.00;
        double rate;

        for(rate = 5; rate <= 10; rate++){
            System.out.println();
            System.out.println("Year" + "\t\t\t" + "Amount on deposit " + rate + "%");
            for(int year = 1; year <= 10; year++){
                amount = principal * Math.pow(1.0 + (rate/100), year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}
