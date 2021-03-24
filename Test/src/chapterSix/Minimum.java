package chapterSix;

public class Minimum {

    private static double first;
    private static double second;
    private static double third;

    public static void setFirstNumber(double first) {
        if (first > 0)
            Minimum.first = first;
    }

    public static double getFirstNumber() {
        return first;
    }

    public static void setSecondNumber(double second) {
        if (second > 0)
            Minimum.second = second;
    }

    public static double getSecondNumber() {
        return second;
    }

    public static void setThirdNumber(double third) {
        if (third > 0)
            Minimum.third = third;
    }

    public static double getThirdCNumber() {
        return third;
    }

    public static double minimum(double firstNumber, double secondNumber, double thirdNumber) {
        double min;
        min = Math.min(firstNumber,Math.min(secondNumber, thirdNumber));
        return min;
    }
}
