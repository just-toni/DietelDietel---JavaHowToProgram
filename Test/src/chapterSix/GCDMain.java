package chapterSix;

import java.util.Scanner;

public class GCDMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input1 = reader.nextInt();
        GCD.setFirstInput(input1);
        System.out.println("Enter a number: ");
        int input2 = reader.nextInt();
        GCD.setSecondInput(input2);

        System.out.println(GCD.calculateGCD(GCD.getFirstInput(),GCD.getSecondInput()));
    }
}
