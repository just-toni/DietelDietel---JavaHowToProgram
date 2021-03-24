package com.Exercises.chapterFour.CreditLimitCalculatorClass;

public class CreditCardCalculatorTest {
    public static void main(String[] args) {
        CreditCardCalculator customer1 = new CreditCardCalculator(0, 0, 0, 0, 0);
        customer1.setAccountNumber(245673898);
        customer1.setMonthBalance(45670900);
        customer1.setMonthCreditTotal(675678);
        customer1.setMonthChargeTotal(345678087);
        customer1.setCreditLimit(345678890);

        System.out.printf("The account number is %d%n", customer1.getAccountNumber());
        System.out.printf("The month balance is %d%n", customer1.getMonthBalance());
        System.out.printf("The month credit total is %d%n", customer1.getMonthCreditTotal());
        System.out.printf("The month charge total is %d%n", customer1.getMonthChargeTotal());
        System.out.printf("The credit limit is %d%n", customer1.getCreditLimit());
        System.out.printf("The new balance is %d%n ", customer1.calculateNewBalance());

    }
}
