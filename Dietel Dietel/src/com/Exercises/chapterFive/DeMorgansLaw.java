package com.Exercises.chapterFive;

public class DeMorgansLaw {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        int j = 0;
        int i = 0;
        int g = 0;

        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println(!(x < 5) && (y >= 7));
        System.out.println(!(a == b) || !(g != 5));
        System.out.println(!((a == b) || (g != 5)));
        System.out.println(!((x <= 8) && (y > 4)));
        System.out.println(!(x <= 8) && !(y > 4));
        System.out.println(!((i > 4) || (j <= 6)));
        System.out.println(!(i > 4) || !(j <= 6));
    }
}
