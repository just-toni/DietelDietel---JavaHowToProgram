package chapterSix;

import java.util.Scanner;

public class CircleAreaMain {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a value: ");
        double input = reader.nextDouble();
        CircleArea.setRadius(input);

        double result = CircleArea.circleArea(CircleArea.getRadius());
        System.out.println("Area of circle is: " + result);
    }
}
