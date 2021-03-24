package chapterSix;

import java.util.Scanner;

public class TemperatureConversionMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = reader.nextDouble();
        System.out.println("Temperature in Fahrenheit is: " + TemperatureConversion.fahrenheit(celsius));

        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = reader.nextDouble();
        System.out.println("Temperature in Celsius is: " + TemperatureConversion.fahrenheit(fahrenheit));
    }
}
