package chapterSix;

import java.security.SecureRandom;

public class CAI2 {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    private static int studentAnswer;

    public static int generateFirstRandomNumbers() {
        firstNumber = 1 + secureRandom.nextInt(20);
        return firstNumber;
    }

    public static int generateSecondRandomNumber() {
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


    public static String getCorrectFeedback(int studentAnswer) {
        int generateComment = 1 + secureRandom.nextInt(4);
        String result = "";
        if (studentAnswer == multiply()) {
            switch (generateComment) {
                case 1 -> result = "Very good";
                case 2 -> result = "Excellent";
                case 3 -> result = "Nice work!";
                case 4 -> result = "Keep up the good work!";
            }
        }
        return result;
    }

    public static String getFeedbackForIncorrectAnswers(int studentAnswer) {
        int generateComment = 1 + secureRandom.nextInt(4);
        String result = "";
        if (studentAnswer != multiply()) {
            switch (generateComment) {
                case 1 -> result = "No. Please try again.";
                case 2 -> result = "Don't give up!";
                case 3 -> result = "No. Keep trying";
                case 4 -> result = "Wrong, Try once more";
            }
        }
        return result;
    }

}



