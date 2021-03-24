package com.Exercises.chapterFive;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        int counter = 10;
        while(counter >=1 ){
            System.out.printf("%d ", counter--);
        }

        for(int i = 1; i >= 1; i*=3){
            System.out.println(i);
        }

        counter = 1;
        for (; counter <= 10; counter++){
            int cube = counter * counter * counter;
            System.out.println(cube);
        }
        counter = 1;
        while (counter <= 10) {
            int cube = counter * counter * counter;
            System.out.printf("%d ", cube);
            counter++;
        }


        for (counter = 10; counter >= 1; counter--) { System.out.println(counter * counter * counter); }

        int x = 1; while (++x <= 10) { System.out.println(x * x * x);}

        counter = 1;
        for(int i = 7; i <= 77; i+=7){
            System.out.printf("The counter for %d time: " , counter++);
           System.out.println(i);
        }

        String promptMessage = """
                Press 1 for Yoruba
                Press 2 for Igbo
                Press 3 for Hausa
                Press 4 for English
                """;
        System.out.println(promptMessage);
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = reader.nextInt();

        switch (input) {
            case 2 -> System.out.println("Igbo Kwenu!!!");
            case 1 -> System.out.println("Omo-onile Kwenu!!!");
            case 4 -> System.out.println("Hello Weird People");
            case 3 -> System.out.println("Anoki Kwenu!!!");
            default -> System.out.println("Wrong input!!");
        }
    }


}