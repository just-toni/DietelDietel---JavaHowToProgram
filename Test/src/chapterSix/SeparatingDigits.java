package chapterSix;

public class SeparatingDigits {
    private static int firstInput;
    private static int secondInput;

    public static void setFirstInput(int firstInput) {
        if (firstInput > 0)
            SeparatingDigits.firstInput = firstInput;
    }

    public static int getFirstInput() {
        return firstInput;
    }

    public static void setSecondInput(int secondInput) {
        if (secondInput > 0)
            SeparatingDigits.secondInput = secondInput;
    }

    public static int getSecondInput() {
        return secondInput;
    }

    public static int calculateQuotient(int firstInput, int secondInput) {
        return  firstInput / secondInput;
    }

    public static int calculateReminder(int firstInput, int secondInput) {
        int i = firstInput % secondInput;
        if(i != 0);
         return i;
    }


    public static String displayDigits(int firstInput) {
        String result = "";
        while (firstInput != 0) {
            if (result.length() == 0) {
                result += calculateReminder(firstInput, 10);
            } else {
                result = calculateReminder(firstInput, 10) + "  " + result;
            }
            firstInput = calculateQuotient(firstInput, 10);
        }
        return result;
    }
}
