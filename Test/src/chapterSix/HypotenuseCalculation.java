package chapterSix;

public class HypotenuseCalculation {
    private static double side1;
    private static double side2;

    public static void setFirstInput(double side1) {
        if (side1 > 0.0)
            HypotenuseCalculation.side1 = side1;
    }

    public static double getFirstInput() {
        return side1;
    }

    public static void setSecondInput(double side2) {
        if (side2 > 0.0)
            HypotenuseCalculation.side2 = side2;
    }

    public static double getSecondInput() {
        return side2;
    }

    public static double calculateHypotenuse(double side1, double side2) {
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result = 0;
        result1 = Math.pow(side1, 2);
        result2 = Math.pow(side2, 2);
        result3 = result1 + result2;
        result = Math.sqrt(result3);
        return result;

//        double result = 1;
//        result = Math.hypot(side1,side2);
//        return result;
    }
}
