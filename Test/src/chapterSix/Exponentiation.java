package chapterSix;

public class Exponentiation {
    private static int firstNumber;
    private static int secondNumber;

    public static int integerPower(int firstNUmber, int secondNumber) {
        int result = 1;
        int i = 1;
        while(i <= secondNumber){
            result *= firstNUmber;
            i++;
        }
        return result;
    }

    public static void setFirstInput(int firstNumber) {
        if (firstNumber > 0)
            Exponentiation.firstNumber = firstNumber;
    }

    public static int getFirstInput() {
        return firstNumber;
    }

    public static void setSecondInput(int secondNumber) {
        if (secondNumber > 0)
            Exponentiation.secondNumber = secondNumber;
    }

    public static int getSecondInput() {
        return secondNumber;
    }
}
