package chapterSix;

import java.util.Scanner;

public class ExponentiationMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstInput = reader.nextInt();
        Exponentiation.setFirstInput(firstInput);
        System.out.println("Enter second number");
        int secondInput = reader.nextInt();
        Exponentiation.setSecondInput(secondInput);

        System.out.println(Exponentiation.integerPower(Exponentiation.getFirstInput(),Exponentiation.getSecondInput()));
    }
}
