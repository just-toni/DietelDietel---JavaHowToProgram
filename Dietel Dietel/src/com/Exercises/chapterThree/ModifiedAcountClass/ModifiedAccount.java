package com.Exercises.chapterThree.ModifiedAcountClass;

public class ModifiedAccount {

    private String name;
    private double balance;

    public ModifiedAccount(String name) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double depositBalance){
        if (depositBalance < 0)
            System.out.println("Invalid entry");
        else
            balance = balance + depositBalance;
    }
    public void withdraw(double withdrawBalance){
        if (withdrawBalance < 0)
            System.out.println("Invalid input");
        if (withdrawBalance > balance)
            System.out.println("Insufficient balance");
        else
            balance = balance - withdrawBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}