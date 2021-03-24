package FirstSetOfTddPractice;

import java.util.Scanner;

public class ArithmeticsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arithmetics arithmetics = new Arithmetics();


        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextInt();
        arithmetics.setFirstNumber(firstNumber);

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextInt();
        arithmetics.setSecondNumber(secondNumber);

        arithmetics.addTwoNumbers(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.subtractTwoNumbers(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.multiplyTwoNumbers(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.divideTwoNumbers(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.averageOfTwoNumbers(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.setMinimum(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.setMaximum(arithmetics.getFirstNumber(), arithmetics.getSecondNumber());
        arithmetics.setSquare(arithmetics.getFirstNumber());
        System.out.printf("The square of %.1f is: %.1f", firstNumber, arithmetics.getSquare());
        arithmetics.setSquare(arithmetics.getSecondNumber());
        System.out.println();
        System.out.printf("The square of %.1f is: %.1f", secondNumber, arithmetics.getSquare());
        System.out.println();
        arithmetics.calculateCube(arithmetics.getFirstNumber());
        System.out.printf("The cube of %.1f is: %.1f", firstNumber, arithmetics.getCube());
        System.out.println();
        arithmetics.calculateCube(arithmetics.getSecondNumber());
        System.out.printf("The cube of %.1f is: %.1f", secondNumber, arithmetics.getCube());
        System.out.println();

        System.out.printf("The sum of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getSumOfTwoNumbers());
        System.out.println();
        System.out.printf("The subtraction of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getSubtractionOfTwoNumbers());
        System.out.println();
        System.out.printf("The multiplication of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getMultiplicationOfTwoNumbers());
        System.out.println();
        System.out.printf("The division of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getDivisionOfTwoNumbers());
        System.out.println();
        System.out.printf("The average of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getAverageOfTwoNumbers());
        System.out.println();
        System.out.printf("The minimum number of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getMinimum());
        System.out.println();
        System.out.printf("The maximum number of %.1f and %.1f is: %.1f", firstNumber, secondNumber, arithmetics.getMaximum());
        System.out.println();

    }
}
