package com.Exercises.chapterFour;

import java.util.Scanner;
public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N\t\t" + "10 * N\t\t" + "100 * N\t\t" + "1000 * N");
        int counter = 1;
        while(counter <= 5){
            System.out.println(counter + "\t\t" + (10 * counter) + "\t\t\t" + (100 * counter) + "\t\t\t" + (1000 * counter));
            counter++;
        }
    }
}

