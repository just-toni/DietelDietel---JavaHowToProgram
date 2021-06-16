package com.Exercises.chapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// another way to do a and b
//        int counter = 1;
//        String asterisks = "*";
//
//        for (int i = 1; i < 11; i++) {
//            System.out.print(asterisks.repeat(counter));
//            System.out.println();
//            counter++;
//        }
//        System.out.println();
//
//
//        counter = 10;
//        asterisks = "*";
//
//        for (int i = 10; i > 0; i--) {
//            System.out.print(asterisks.repeat(counter));
//            System.out.println();
//            counter--;
//        }

//        for(int i = 10; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

//        int spaces = 0;
//        for(int i = 10; i>= 1; i--){
//            for(int j = 0; j < spaces; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j < i; j++){
//                System.out.print("*");
//            }
//            spaces ++;
//            System.out.println();
//        }
//
        int spaces = 10;
        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            spaces --;
            System.out.println();
        }

    }
}
