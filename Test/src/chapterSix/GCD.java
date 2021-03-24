package chapterSix;

public class GCD {
    private static int firstInput;
    private static int secondInput;

    public static void setFirstInput(int firstInput) {
        if(firstInput > 0)
            GCD.firstInput = firstInput;
    }

    public static int getFirstInput() {
        return firstInput;
    }

    public static void setSecondInput(int secondInput) {
        if(secondInput > 0)
            GCD.secondInput = secondInput;
    }

    public static int getSecondInput() {
        return secondInput;
    }

    public static int calculateGCD(int firstInput, int secondInput) {
        int max = Math.max(firstInput, secondInput);
        int gcd = 0;
        for(int i = 1; i < max; i++){
            if(firstInput % i == 0 && secondInput % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
