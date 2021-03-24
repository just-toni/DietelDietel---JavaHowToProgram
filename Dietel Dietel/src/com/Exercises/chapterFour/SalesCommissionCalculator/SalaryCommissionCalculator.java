package com.Exercises.chapterFour.SalesCommissionCalculator;

import java.util.Scanner;

public class SalaryCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int salary = 200;
        double increment = 0.09;
        double newSalary;
        double value = 0;
        double total = 0;

//        int sentinel = -1;
//        while (sentinel != -1)
//            System.out.println("Enter item number of press -1 to quit: ");
        System.out.println("Enter item number: ");
        int item = input.nextInt();
        while (item > 0) {
            if (item >= 1 && item <= 4) {
                if (item == 1) {
                    value = 239.99;
                }
                if (item == 2) {
                    value = 129.75;
                }
                if (item == 3) {
                    value = 99.85;
                }
                if (item == 4) {
                    value = 350.89;
                }
                total = total + value;
                System.out.println(total);
                System.out.println("Enter item number: ");
                item = input.nextInt();
            }
        }
        newSalary = salary + (increment * total);
        System.out.println(newSalary);
    }
}
