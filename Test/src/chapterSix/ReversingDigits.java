package chapterSix;

public class ReversingDigits {
    public static int  reverseDigits(int number) {
        int reverseDigits = 0;
        int rem = 0;
        for(; number != 0; number/= 10){
            rem = number % 10;
            reverseDigits = reverseDigits * 10 + rem;
        }
        return reverseDigits;
    }

}
