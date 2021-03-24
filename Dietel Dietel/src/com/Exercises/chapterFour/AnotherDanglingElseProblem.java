package com.Exercises.chapterFour;

public class AnotherDanglingElseProblem {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        if (y == 8){
            if (x == 5){
                System.out.println("@@@@@");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
            else{
                System.out.println("#####");
            }
            if (y == 8){
                if (x == 5){
                        System.out.println("@@@@@");
                    }
                else {
                    System.out.println("#####");
                    System.out.println("$$$$$");
                    System.out.println("*****");
                    }
            }
        }
        if (y == 8){
            if (x == 5){
                System.out.println("@@@@@");
            }
            else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("*****");
            }
        }
        if (y == 7){
            if (x == 5){
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
            else {
                System.out.println("*****");
            }
        }
    }
}
