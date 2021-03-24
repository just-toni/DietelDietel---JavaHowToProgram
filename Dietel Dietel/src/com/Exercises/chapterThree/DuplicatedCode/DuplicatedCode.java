package com.Exercises.chapterThree.DuplicatedCode;

public class DuplicatedCode {

    private String name;
    private int balance;
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }

    public DuplicatedCode(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
public static void displayAccount(DuplicatedCode account){
    System.out.printf("%nadding to account1 balance%n%n", account);

}



}
