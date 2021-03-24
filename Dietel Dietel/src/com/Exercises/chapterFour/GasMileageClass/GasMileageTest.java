package com.Exercises.chapterFour.GasMileageClass;

public class GasMileageTest {

    public static void main(String[] args) {
        GasMileage automobile = new GasMileage();
        System.out.printf("The miles per gallon is: %.2f%n", automobile.MilesPerGallon(40, 8));
    }
}
