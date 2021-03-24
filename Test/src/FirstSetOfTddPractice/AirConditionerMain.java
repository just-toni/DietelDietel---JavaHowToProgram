package FirstSetOfTddPractice;

import java.util.Scanner;

public class AirConditionerMain {
    public static void main(String[] args) {
        Scanner toni = new Scanner(System.in);
        AirConditioner  ac = new AirConditioner(true);

        System.out.println("Enter name of air conditioner: ");
        String productName = toni.next();
        ac.setProductName(productName);

    }
}
