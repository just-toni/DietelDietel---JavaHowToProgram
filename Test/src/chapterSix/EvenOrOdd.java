package chapterSix;

public class EvenOrOdd {
    private static int number1;

    public static void setFirstInput(int number1) {
        if(number1 > 0)
            EvenOrOdd.number1 = number1;
    }

    public static int getFirstInput() {
        return number1;
    }

    public static boolean isEven(int number1) {
        return (number1 % 2 == 0);
    }
}
