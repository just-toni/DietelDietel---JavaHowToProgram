package com.Exercises.chapterSix;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        String[] toni = new String[5];
        System.out.println("Before assigning values to the elements in TONI");
        System.out.println(Arrays.toString(toni));

        for (int counter = 0; counter < toni.length; counter++) {
            toni[counter] = String.format("" + counter);
        }

        System.out.println("After assigning values to the elements in TONI");
        System.out.println(Arrays.toString(toni));

















        int [] multiples = new int[10];
        System.out.println("Components of array before assignment");

        for (int counter = 0; counter < multiples.length; counter++) {
            System.out.printf("%d ", multiples[counter]);
        }

        for (int counter = 0; counter < multiples.length; counter++) {
            multiples[counter] = counter * 3;
        }
        System.out.println();
        System.out.println("Components of array after assignment");
        for (int counter = 0; counter < multiples.length; counter++) {
            System.out.printf("%d ", multiples[counter]);
        }

        System.out.println();
        System.out.println("Components of array after assignment: enhanced for loop");
        for (int element :  multiples){
            System.out.printf("%d ", element);
        }

        System.out.println();
        System.out.println("Getting first 5 elements of an array");
        for (int counter = 0; counter < multiples.length - 5; counter++) {
            System.out.printf("%d ", multiples[counter]);

        }

        System.out.println();
        System.out.println("Counter begins from one");
        for (int counter = 1; counter < multiples.length ; counter++) {
            System.out.printf("%d ", multiples[counter]);

        }
    }
}
