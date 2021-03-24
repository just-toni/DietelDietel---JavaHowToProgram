package chapterFive;

import java.util.Scanner;

public class FairTaxMain {
    public static void main(String[] args) {

        FairTax fairTax = new FairTax();

        String prompt = """
                Welcome to the Tax Calculator
                Enter 0 to exit and view total tax 
                Enter 1 for Housing
                Enter 2 for Food
                Enter 3 for Clothing
                Enter 4 for Transportation
                Enter 5 for Education
                Enter 6 for Health Care
                Enter 7 for Vacations
                """;
        System.out.println(prompt);
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        double costInput;

        while (input != 0) {
            switch (input) {
                case 1 -> {
                    System.out.println("How much did you spend on housing this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                case 2 -> {
                    System.out.println("How much did you spend on Food this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                case 3 -> {
                    System.out.println("How much did you spend on clothing this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                case 4 -> {
                    System.out.println("How much did you spend on Transportation this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                case 5 -> {
                    System.out.println("How much did you spend on Education this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                case 6 -> {
                    System.out.println("How much did you spend on Health care this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                case 7 -> {
                    System.out.println("How much did you spend on Vacation this month?");
                    costInput = reader.nextDouble();
                    fairTax.setExpenses(costInput);
                }
                default -> System.out.println("Invalid input");
            }
            System.out.println(prompt);
            input = reader.nextInt();
        }
        System.out.printf("Your fair tax for this month is: %.2f",fairTax.calculateTax());
    }
}