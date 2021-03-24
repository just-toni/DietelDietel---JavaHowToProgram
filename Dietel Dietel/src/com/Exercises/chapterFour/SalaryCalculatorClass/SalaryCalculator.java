package com.Exercises.chapterFour.SalaryCalculatorClass;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfHoursWorked = 0;
        double hourlyRates;
        int grossPay;

        int sentinel = 1;
        while (sentinel != -1){
            System.out.println("Enter number of hours worked: or press -1 to exit");
//            if (numberOfHoursWorked < 1){
//                System.out.println("You can't work for less than an hour");
//            }
            numberOfHoursWorked = input.nextInt();
            if(numberOfHoursWorked == -1){
                sentinel = -1;
            }
            System.out.println("Enter hourly rates: ");
            hourlyRates = input.nextInt();
            if(hourlyRates == -1){
                sentinel = -1;
            }

            if (numberOfHoursWorked < 1 || hourlyRates < 1) {
                sentinel = -1;
            }
            else {
                if (numberOfHoursWorked > 40){
                    grossPay = (int) (numberOfHoursWorked * (hourlyRates + (hourlyRates * 0.5)));
                }
                else {
                    grossPay = (int)hourlyRates * numberOfHoursWorked;
                }
                System.out.printf("Gross payment is: %d%n ", grossPay);
            }
        }
    }

}
