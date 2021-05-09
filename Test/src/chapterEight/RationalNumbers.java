package chapterEight;

import chapterSix.GCD;

public class RationalNumbers {
    private int denominator;
    private int numerator;

    public RationalNumbers(int numerator, int denominator) {
        int gcd = GCD.calculateGCD(numerator, denominator);
        if (denominator < 0) this.numerator = -1 * numerator/ gcd;
        else if (denominator > 0) this.numerator = numerator/gcd;
        else this.numerator = 0;
        this.denominator = Math.abs(denominator) /  gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static RationalNumbers add(RationalNumbers rationalNumbers1, RationalNumbers rationalNumbers2) {
        int denominator = rationalNumbers1.getDenominator() * rationalNumbers2.getDenominator();
        int numerator = rationalNumbers1.getNumerator() * rationalNumbers2.getDenominator() +
                rationalNumbers1.getDenominator() * rationalNumbers2.getNumerator();
        return new RationalNumbers(numerator, denominator);
    }

    public static RationalNumbers subtract(RationalNumbers rationalNumbers1, RationalNumbers rationalNumbers2) {
        int denominator = rationalNumbers1.getDenominator() * rationalNumbers2.getDenominator();
        int numerator = rationalNumbers1.getNumerator() * rationalNumbers2.getDenominator() -
                rationalNumbers1.getDenominator() * rationalNumbers2.getNumerator();
        return new RationalNumbers(numerator, denominator);
    }

    public static RationalNumbers multiply(RationalNumbers rationalNumbers1, RationalNumbers rationalNumbers2) {
        int denominator = rationalNumbers1.getDenominator() * rationalNumbers2.getDenominator();
        int numerator = rationalNumbers1.getNumerator() * rationalNumbers2.getNumerator();
        return new RationalNumbers(numerator, denominator);
    }

    public static RationalNumbers divide(RationalNumbers rationalNumbers1, RationalNumbers rationalNumbers2) {
        int newRationalNumerator2 = rationalNumbers2.getDenominator();
        int newRationalDenominator2 = rationalNumbers2.getNumerator();
        int denominator = rationalNumbers1.getDenominator() * newRationalDenominator2;
        int numerator = rationalNumbers1.getNumerator() * newRationalNumerator2;
        return new RationalNumbers(numerator, denominator);
    }

   }
