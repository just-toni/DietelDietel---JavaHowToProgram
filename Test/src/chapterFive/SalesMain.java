package chapterFive;

import java.util.Scanner;

public class SalesMain {
    public static void main(String[] args) {
        Sales calculator = new Sales();

        String prompt = """
                Enter a product number or 0 to exit
                Product 1 = $2.98
                Product 2 = $4.50
                Product 3 = $9.98
                Product 4 = $4.59
                Product 5 = $6.87
                """;
        System.out.println(prompt);
        Scanner reader = new Scanner(System.in);
        int productNumber = reader.nextInt();
        double product = 0;
        do {
            System.out.println("Enter quantity of product " + productNumber + " preferred: ");
            int quantity = reader.nextInt();

            switch (productNumber) {
                case 1 -> {
                    calculator.setPrice(2.98);
                    calculator.setQuantity(quantity);
                    product = calculator.calculateProduct();
                }
                case 2 -> {
                    calculator.setPrice(4.50);
                    calculator.setQuantity(quantity);
                    product = calculator.calculateProduct();
                }
                case 3 -> {
                    calculator.setPrice(9.98);
                    calculator.setQuantity(quantity);
                    product = calculator.calculateProduct();
                }
                case 4 -> {
                    calculator.setPrice(4.59);
                    calculator.setQuantity(quantity);
                    product = calculator.calculateProduct();
                }
                case 5 -> {
                    calculator.setPrice(6.87);
                    calculator.setQuantity(quantity);
                    product = calculator.calculateProduct();
                }
                default -> System.out.println("Invalid product number entered");
            }
            System.out.println();
            System.out.println(prompt);
            productNumber = reader.nextInt();
        }
        while (productNumber != 0);
        System.out.printf("Total cost of goods sold is %.2f",product);
    }
}
