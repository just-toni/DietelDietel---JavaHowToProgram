package chapterSix;

import java.util.Scanner;

public class DistanceBetweenPointsMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number: ");
        double first = reader.nextDouble();
        DistanceBetweenPoints.setFirstCoordinate(first);
        System.out.println("Enter number: ");
        double second = reader.nextDouble();
        DistanceBetweenPoints.setFirstCoordinate(second);
        System.out.println("Enter number: ");
        double third = reader.nextDouble();
        DistanceBetweenPoints.setFirstCoordinate(third);
        System.out.println("Enter number: ");
        double fourth = reader.nextDouble();
        DistanceBetweenPoints.setFirstCoordinate(fourth);

        System.out.printf("Distance between points %.2f,%.2f,%.2f,%.2f is %.2f", first,second,third,fourth, DistanceBetweenPoints.calculateDistance(first,second,third,fourth));
    }
}
