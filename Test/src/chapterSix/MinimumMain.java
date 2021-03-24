package chapterSix;

import java.util.Scanner;

public class MinimumMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double input1 = reader.nextDouble();
        Minimum.setFirstNumber(input1);
        System.out.println("Enter a number: ");
        double input2 = reader.nextDouble();
        Minimum.setSecondNumber(input2);
        System.out.println("Enter a number: ");
        double input3 = reader.nextDouble();
        Minimum.setThirdNumber(input3);

        System.out.println(Minimum.minimum(Minimum.getFirstNumber(), Minimum.getSecondNumber(), Minimum.getThirdCNumber()));
    }
}
