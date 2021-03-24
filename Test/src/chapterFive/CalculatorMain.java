package chapterFive;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String prompt = """
                Hello there;
                Welcome to chapterFive.Calculator 101.
                Press 1 for addition.
                Press 2 for subtraction.
                Press 3 for multiplication.
                Press 4 for division.
                Press 5 for absolute subtraction.
                """;

        System.out.println(prompt);
        int userEntry = reader.nextInt();
        System.out.println("Input first number");
        int firstNumber = reader.nextInt();
        System.out.println("Input second number");
        int secondNumber = reader.nextInt();
        switch (userEntry) {
            case 1 -> System.out.println(calculator.add(firstNumber, secondNumber));
            case 2 -> System.out.println(calculator.subtract(firstNumber, secondNumber));
            case 3 -> System.out.println(calculator.multiply(firstNumber, secondNumber));
            case 4 -> System.out.println(calculator.quotient(firstNumber, secondNumber));
            default -> System.out.println("Please enter a correct value");
        }
    }
}
