package chapterSix;

public class Multiples {
    private static int firstInput;
    private static int secondInput;

    public static void setFirstInput(int firstInput) {
        if (firstInput > 0)
            Multiples.firstInput = firstInput;
    }

    public static int getFirstInput() {
        return firstInput;
    }

    public static void setSecondInput(int secondInput) {
        if (secondInput > 0)
            Multiples.secondInput = secondInput;
    }

    public static int getSecondInput() {
        return secondInput;
    }

    public static boolean isMultiple(int firstInput, int secondInput) {
        return secondInput % firstInput == 0;
    }
}
