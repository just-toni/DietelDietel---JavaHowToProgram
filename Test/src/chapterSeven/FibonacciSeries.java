package chapterSeven;

public class FibonacciSeries {
    private static int fibonacci;

    public static void calculateFibonacci(int input) {
        int firstNumber = 0;
        int secondNumber = 1;
        fibonacci = 0;
        for (int i = 0; i < input; i++) {
            fibonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }

    public static int getFibonacci() {
        return fibonacci;
    }
}
