package com.Exercises.chapterFour;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        boolean aTriangle;

        System.out.println("Enter a number: ");
        side1 = triangle.nextInt();
        System.out.println("Enter a number: ");
        side2 = triangle.nextInt();
        System.out.println("Enter a number: ");
        side3 = triangle.nextInt();

        aTriangle = false;
        if (side1 < (side2 + side3)) {
            aTriangle = true;
        } else {
            if (side2 < (side1 + side3)) {
                aTriangle = true;
            } else {
                if (side3 < (side1 + side2)) {
                    aTriangle = true;
                }
            }
        }
        if (aTriangle) {
            System.out.println("The three sides can form a trinagle");
        }else {
            System.out.println("A triangle can't be formed");
            }
        }

    }
