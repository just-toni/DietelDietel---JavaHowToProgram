package chapterFive;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }
        return secondNumber - firstNumber;
    }

    public double quotient(int numerator, int denominator) {
        if(denominator == 0){
            return 0;
        }
        return numerator / (denominator * 1.0);
    }


}
