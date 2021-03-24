package chapterSix;

import java.security.SecureRandom;

public class CAI {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    private static int studentAnswer;

    public static int generateFirstRandomNumbers() {
        firstNumber = 1 + secureRandom.nextInt(20);
        return firstNumber;
    }

    public static int generateSecondRandomNumber(){
        secondNumber = 1 + secureRandom.nextInt(20);
        return secondNumber;
    }

    public static int multiply() {
        return firstNumber * secondNumber;
    }

    public static String getQuestion() {
        return "How much is " + firstNumber + " times " + secondNumber;
    }

    public static int getStudentAnswer() {
        return studentAnswer;
    }


    public static String getFeedback(int studentAnswer) {
        if(studentAnswer != multiply()){
            return "No. Please try again.";
        }
        else
            return "Very good!";
    }
}
