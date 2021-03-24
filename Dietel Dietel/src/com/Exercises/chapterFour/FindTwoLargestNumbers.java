package com.Exercises.chapterFour;

import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 3;
        int number = 0;
        System.out.println("enter value " + 1 );
        int firstNum = scanner.nextInt();
        System.out.println("enter value " + 2);
        int secondNum = scanner.nextInt();
        int L = firstNum;
        int L2  = secondNum;
        if(firstNum < secondNum){
            L = secondNum;
            L2 = firstNum;
        }
        while(counter <= 10){
            System.out.println("enter value " + counter);
            int temp = scanner.nextInt();
            if (L <= temp){
                L2 = L;
                L = temp;
            }else{
                if(L2 <= temp){
                    L2 = temp;
                }
            }
            counter++;
        }
        System.out.println(L);
        System.out.println(L2);
    }
}

// find a way not to allow user enter  number more than once
// find a way to print the two largest values