package chapterFive;

import java.util.Scanner;

public class BarChartAsterisksMain {
    public static void main(String[] args) {
        BarChartAsterisks asterisks = new BarChartAsterisks();
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = reader.nextInt();
        System.out.println("Enter first number");
        int secondNumber = reader.nextInt();
        System.out.println("Enter first number");
        int thirdNumber = reader.nextInt();
        System.out.println("Enter first number");
        int fourthNumber = reader.nextInt();
        System.out.println("Enter first number");
        int fifthNumber = reader.nextInt();

        System.out.println(asterisks.printAsterisks(firstNumber));
        System.out.println(asterisks.printAsterisks(secondNumber));
        System.out.println(asterisks.printAsterisks(thirdNumber));
        System.out.println(asterisks.printAsterisks(fourthNumber));
        System.out.println(asterisks.printAsterisks(fifthNumber));
    }
}
