package chapterSix;

import java.security.SecureRandom;

public class CAI3 {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    private static int studentAnswer;
    private static int studentScore = 0;

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
            studentScore += 10;
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


    public static String displayScoreMessage() {
        String result = "";
        if(studentScore >= 70){
            result = "Congratulations, you are ready to go to the next level";
        }
        else
            result = "Please ask your teacher for extra help";
        return result;
    }
}
