package chapterSix;

import java.util.Scanner;

public class HypotenuseCalculationMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double input1 = reader.nextDouble();
        HypotenuseCalculation.setFirstInput(input1);

        System.out.println("Enter a number: ");
        double input2 = reader.nextDouble();
        HypotenuseCalculation.setSecondInput(input2);

        System.out.println(HypotenuseCalculation.calculateHypotenuse(HypotenuseCalculation.getFirstInput(), HypotenuseCalculation.getSecondInput()));
    }
}
