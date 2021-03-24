package com.Exercises.chapterFour.CreditLimitCalculatorClass;

public class CreditCardCalculator {

    int accountNumber;
    int monthBalance;
    int monthChargeTotal;
    int monthCreditTotal;
    int creditLimit;

    public CreditCardCalculator(int accountNumber, int monthBalance, int monthChargeTotal, int monthCreditTotal, int creditLimit) {
        this.accountNumber = accountNumber;
        this.monthBalance = monthBalance;
        this.monthChargeTotal = monthChargeTotal;
        this.monthCreditTotal = monthCreditTotal;
        this.creditLimit = creditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMonthBalance() {
        return monthBalance;
    }

    public void setMonthBalance(int monthBalance) {
        this.monthBalance = monthBalance;
    }

    public int getMonthChargeTotal() {
        return monthChargeTotal;
    }

    public void setMonthChargeTotal(int monthCharge) {
        this.monthChargeTotal = monthChargeTotal;
    }

    public int getMonthCreditTotal() {
        return monthCreditTotal;
    }

    public void setMonthCreditTotal(int monthCreditTotal) {
        this.monthCreditTotal = monthCreditTotal;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }

    public int calculateNewBalance() {
        int newBalance = (monthBalance + monthChargeTotal - monthCreditTotal);
        if (creditLimit < newBalance){
            System.out.println("Credit limit exceeded");
        }
        return newBalance;
    }
}

