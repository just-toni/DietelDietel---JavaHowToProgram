package com.Exercises.chapterThree.ModifiedAcountClass;

    public class ModifiedAccountTest {
        public static void main(String[] args) {
            ModifiedAccount Account1 = new ModifiedAccount("");
            Account1.deposit(-100);
            Account1.withdraw(500);
            System.out.println("Your new balance is " + Account1.getBalance());
        }

    }