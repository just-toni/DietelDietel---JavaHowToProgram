package FirstSetOfTddPractice;

public class Arithmetics {
    private double firstNumber;
    private double secondNumber;
    private double sum;
    private double multiply;
    private double divide;
    private double subtract;
    private double average;
    private double minimum;
    private double maximum;
    private double square;
    private double cube;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void addTwoNumbers(double firstNumber, double secondNumber) {
        sum = firstNumber + secondNumber;
    }

    public double getSumOfTwoNumbers() {
        return sum;
    }

    public void multiplyTwoNumbers(double firstNumber, double secondNumber) {
        multiply = firstNumber * secondNumber;
    }

    public double getMultiplicationOfTwoNumbers() {
        return multiply;
    }

    public void divideTwoNumbers(double firstNumber, double secondNumber) {
        divide = firstNumber /( secondNumber * 1.0);
    }

    public double getDivisionOfTwoNumbers() {
        return divide;
    }

    public void subtractTwoNumbers(double firstNumber, double secondNumber) {
        subtract = firstNumber - secondNumber;
    }

    public double getSubtractionOfTwoNumbers() {
        return subtract;
    }

    public void averageOfTwoNumbers(double firstNumber, double secondNumber) {
        average = ((firstNumber + secondNumber) / 2);
    }

    public double getAverageOfTwoNumbers() {
        return average;
    }

    public void setMinimum(double firstNumber, double secondNumber) {
        if (firstNumber <= secondNumber)
            minimum = firstNumber;
        else minimum = secondNumber;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMaximum(double firstNumber, double secondNumber) {
        if (firstNumber >= secondNumber)
            maximum = firstNumber;
        else maximum = secondNumber;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setSquare(double number) {
        square = number * number;
    }

    public double getSquare() {
        return square;
    }

    public void calculateCube(double value) {
        cube = value * value * value;
    }

    public double getCube() {
        return cube;
    }
}
