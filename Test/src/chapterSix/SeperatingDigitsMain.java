package chapterSix;

import java.util.Scanner;

public class SeperatingDigitsMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = reader.nextInt();
        SeparatingDigits.setFirstInput(input);
        System.out.println("Enter a number");
        int input2 = reader.nextInt();
        SeparatingDigits.setSecondInput(input2);

        System.out.println("The quotient is: " + SeparatingDigits.calculateQuotient(SeparatingDigits.getFirstInput(), SeparatingDigits.getSecondInput()));
        System.out.println("The remainder is " + SeparatingDigits.calculateReminder(SeparatingDigits.getFirstInput(),SeparatingDigits.getSecondInput()));
        System.out.println(SeparatingDigits.displayDigits(SeparatingDigits.getFirstInput()));
        System.out.println(SeparatingDigits.displayDigits(SeparatingDigits.getSecondInput()));
    }
}
