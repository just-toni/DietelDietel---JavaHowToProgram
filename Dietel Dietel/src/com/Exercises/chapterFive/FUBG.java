package com.Exercises.chapterFive;

public class FUBG {
    public static void main(String[] args) {

        long userNumber;
        long initialUserNumber = 1_000_000_000;
        double rate = 0.04;
        int month = 1;
        boolean desiredMonth = true;
        int targetNumberOfUsersMonth = 0;
        int secondTargetNumberOfUsersMonth = 0;

        for(; month <= 24; month++){
            userNumber = (long) (initialUserNumber * Math.pow(1.0 + rate, month));
            System.out.println(month + "\t\t\t" + userNumber);
            if(userNumber >= 1500000000 && desiredMonth){
                targetNumberOfUsersMonth = month;
                desiredMonth = false;
            }
            if(userNumber >=  2000000000) {
                secondTargetNumberOfUsersMonth = month;
                break;
            }
        }

        System.out.println("Facebook users grew to 1.5 billion after " + targetNumberOfUsersMonth + " months");
        System.out.println("Facebook users grew to 2 billion after " + secondTargetNumberOfUsersMonth + " months");


    }
}
