package chapterEight;

public class ComplexNumbers {

    private  int realNumber;
    private  int imaginaryNumber;

    public ComplexNumbers(int realNumber, int imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public int getRealNumbers() {
        return realNumber;
    }

    public int getImaginaryNumbers() {
        return imaginaryNumber;
    }

    public static String add(ComplexNumbers complexNumbers, ComplexNumbers complexNumbers2) {
        double result1 = complexNumbers.getRealNumbers() + complexNumbers2.getRealNumbers();
        double result2 = complexNumbers.getImaginaryNumbers() + complexNumbers2.getImaginaryNumbers();
        return result1 + " + " +  result2 + "i";
    }

    public static String subtract(ComplexNumbers complexNumbers, ComplexNumbers complexNumbers2) {
        double result1 = complexNumbers.getRealNumbers() - complexNumbers2.getRealNumbers();
        double result2 = complexNumbers.getImaginaryNumbers() - complexNumbers2.getImaginaryNumbers();
        return result1 + " + " +  result2 + "i";
    }

    public static String multiply(ComplexNumbers complexNumbers, ComplexNumbers complexNumbers2) {
        double result1 = (complexNumbers.getRealNumbers() * complexNumbers2.getRealNumbers() - complexNumbers.getImaginaryNumbers() * complexNumbers2.getImaginaryNumbers());
        double result2 = (complexNumbers.getRealNumbers() * complexNumbers2.getImaginaryNumbers() + complexNumbers.getImaginaryNumbers() * complexNumbers2.getRealNumbers());
        return result1 + " + " +  result2 + "i";
    }

}
