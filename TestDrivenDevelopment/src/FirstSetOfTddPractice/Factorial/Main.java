package FirstSetOfTddPractice.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Factorial factorial = new Factorial();

        System.out.println("Enter a number: ");
        int input = reader.nextInt();
        factorial.collectInput(input);
        factorial.calculateFactorial(factorial.getInput());
        System.out.printf("The factorial of %d is: %d%n", input, factorial.getFactorial());

        System.out.println("Enter a number: ");
        input = reader.nextInt();
        factorial.collectInput(input);
        factorial.calculateMathematicalConstantE(factorial.getInput());
        System.out.printf("The mathematical constant of %d is: %d%n,", input, factorial.getMathConstantE());

        System.out.println("Enter a number: ");
        input = reader.nextInt();
        factorial.collectInput(input);
        factorial.calculateMathematicalConstantEToPowerX(factorial.getInput());
        System.out.printf("The mathematical constant of %d to power %d is: %d%n,", input, input, factorial.getMathConstantEToPowerX());
    }
}
