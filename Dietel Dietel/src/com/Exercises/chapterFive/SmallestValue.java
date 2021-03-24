package com.Exercises.chapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = 0;
        int userInput;

        System.out.println("Enter number of values to be collected: ");
        int input =  reader.nextInt();

        for(int i = 1; i <= input; i++){
            System.out.println("Enter a number");
            userInput = reader.nextInt();
           if(i==1){
               min=userInput;
           }

            if(userInput <= min){
                min = userInput;
            }
        }
        System.out.println("Smallest value is: " + min);
    }
}