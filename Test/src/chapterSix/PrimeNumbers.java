package chapterSix;

public class PrimeNumbers {
    public static boolean isPrimeUsingHalf(int input) {
        int counter = 0;
        for(int i = 2; i <= (input / 2); i++){
            if (input % i == 0)
                counter++;
        }
        if(counter == 0)
            return true;
        else
            return false;
    }

    public static boolean isPrimeUsingSquareRoot(int input) {
        int counter = 0;
        for(int i = 2; i <= (Math.sqrt(input)); i++){
            if (input % i == 0)
                counter++;
        }
        if(counter == 0)
            return true;
        else
            return false;
    }
}
