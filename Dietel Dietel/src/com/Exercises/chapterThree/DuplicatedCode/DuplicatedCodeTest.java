package com.Exercises.chapterThree.DuplicatedCode;

public class DuplicatedCodeTest {
    public static void main(String[] args) {
        DuplicatedCode account = new DuplicatedCode("Toni", 10000);
        DuplicatedCode account1 = new DuplicatedCode("Jane", 20900);
        System.out.println(account1.getName() + "\n" + account1.getBalance());
    }

    public static void displayAccount(DuplicatedCode account) {
        DuplicatedCode account2 = new DuplicatedCode("Toni", 10000);
        DuplicatedCode account1 = new DuplicatedCode("Jane", 20900);
        System.out.println(account1.getName() + "\n" + account1.getBalance());
    }


}
