package com.Exercises.chapterFour;

import java.util.Scanner;

public class SidesOfARightTriangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        boolean aRightTriangle;

        System.out.println("Enter a number: ");
        side1 = triangle.nextInt();
        System.out.println("Enter a number: ");
        side2 = triangle.nextInt();
        System.out.println("Enter a number: ");
        side3 = triangle.nextInt();

        int side1Square = side1 * side1;
        int side2Square = side2 * side2;
        int side3Square = side3 * side3;

        aRightTriangle = false;

        if (side1Square == (side2Square * side3Square)) {
            aRightTriangle = true;
        } else {
            if (side2Square == (side1Square * side3Square)) {
                aRightTriangle = true;
            } else {
                if (side3Square == (side1Square * side2Square)) {
                    aRightTriangle = true;
                }
            }
        }
            if (aRightTriangle) {
                System.out.println("It can form the sides right triangle");
            }
            else
                System.out.println("It can't form a right triangle");
        }
    }