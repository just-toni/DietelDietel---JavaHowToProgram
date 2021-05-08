package chapterEight;

public class RationalNumbers {
    private int denominator;
    private int numerator;

    public RationalNumbers(int numerator, int denominator) {
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int gcd = calculateGCD(numerator, denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static RationalNumbers add(RationalNumbers rationalNumbers1, RationalNumbers rationalNumbers2){
        int lcm = rationalNumbers1.getDenominator() * rationalNumbers2.getDenominator();
        System.out.println("lcm is " + lcm);
        int firstProduct = lcm / rationalNumbers1.getDenominator() * rationalNumbers1.getNumerator();
        System.out.println("first product is " + firstProduct);
        int secondProduct = lcm / rationalNumbers2.getDenominator() * rationalNumbers2.getNumerator();
        System.out.println("second product is " + secondProduct);
        int result = firstProduct + secondProduct;
        System.out.println("result is " + result);
        System.out.println("Final Result is: " + calculateGCD(rationalNumbers1.getDenominator(), rationalNumbers2.getDenominator()) * result + "/" +lcm);
        return calculateGCD(rationalNumbers1.getDenominator(), rationalNumbers2.getDenominator()) * result + "/" +lcm;
    }

    private static int calculateGCD(int numerator, int denominator) {
        int max = Math.max(numerator, denominator);
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int gcd = 0;
        for(int i = 1; i < max; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        return gcd;
    }

}
