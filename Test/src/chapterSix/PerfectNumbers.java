package chapterSix;

public class PerfectNumbers {
    public static boolean isPerfect(int input) {
        boolean result = true;
        int answer = 0;
        if (input > 0) {
            for (int i = 1; i < input; i++) {
                 if (input % i == 0) answer += i;
            }
            result = (answer == input);
        }
        return result;
    }

    public static String getFactorsOfPerfectNumber(int input) {
        String factors = "";
        for (int i = 1; i < input; i++) {
            if (input % i == 0){
                factors = (factors.isEmpty()) ? (i + "") : (factors + "," + i);
            }
        }
        return factors;
    }


    public static void displayPerfectNumbersAndFactors(int first, int last){
        System.out.printf("Perfect Numbers between %d and %d%n ", first, last);
        for(int i = first; i <= last; i++){
            if(isPerfect(i)){
                System.out.printf("%5d: %s%n", i, getFactorsOfPerfectNumber(i));
            }
        }
    }
}
