package chapterSix;

public class RoundingNumbersOne {
    public static double roundNumber(double input) {
        double result;
        result = Math.floor(input + 0.5);
        return result;
    }

    public static double roundNumberToTenth(double input) {
        double result;
        result = Math.floor(input * 10 + 0.5)/10;
        return result;
    }

    public static double roundNumberToHundredth(double input) {
        double result;
        result = Math.floor(input * 100 + 0.5)/100;
        return result;
    }

    public static double roundNumberToThousandth(double input) {
        double result;
        result = Math.floor(input * 1000 + 0.5)/1000;
        return result;
    }
}
