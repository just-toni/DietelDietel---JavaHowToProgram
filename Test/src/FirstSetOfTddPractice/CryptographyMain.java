package FirstSetOfTddPractice;

import java.util.Scanner;

public class CryptographyMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Cryptography cryptography = new Cryptography();

        System.out.println("Enter a number e.g. 1234: ");
        int input = reader.nextInt();
        cryptography.collectInput(input);

        cryptography.separateFourthDigit(cryptography.getInput());
        cryptography.separateThirdDigit(cryptography.getInput());
        cryptography.separateSecondDigit(cryptography.getInput());
        cryptography.separateFirstDigit(cryptography.getInput());

        System.out.printf("The first digit is: %d%n", cryptography.getInput());
        System.out.printf("The second digit is: %d%n", cryptography.getSecondInput());
        System.out.printf("The third digit is: %d%n", cryptography.getThirdInput());
        System.out.printf("The fourth digit is:%d%n", cryptography.getFourthDigit());

        System.out.printf("The first encrypted digit: %d%n", cryptography.encryptFirstDigit());
        System.out.printf("The second encrypted digit: %d%n", cryptography.encryptSecondDigit());
        System.out.printf("The third encrypted digit: %d%n", cryptography.encryptThirdDigit());
        System.out.printf("The fourth encrypted digit: %d%n", cryptography.encryptFourthDigit());

        System.out.printf("The encrypted digits: %s%n", cryptography.getEncryptedDigits());

    }
}
