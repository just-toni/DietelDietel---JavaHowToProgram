package chapterSix;

import java.security.SecureRandom;

public class CAI5 {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    private static int studentAnswer;
    private static int studentScore = 0;
    private static int difficulty;
    private static String firstOperator;
    private static int answer;

    public static int generateFirstRandomNumbers() {
        firstNumber = difficulty + secureRandom.nextInt(9 * difficulty);
        return firstNumber;
    }

    public static int generateSecondRandomNumber() {
        secondNumber = difficulty + secureRandom.nextInt(9 * difficulty);
        return secondNumber;
    }


    public static String generateRandomOperators(){
        int randomOperator = secureRandom.nextInt(4);
        switch (randomOperator) {
            case 1:
                firstOperator = "+";
                break;
            case 2:
                firstOperator = "-";
                break;
            case 3:
                firstOperator = "*";
                break;
            case 4:
                firstOperator = "/";
                break;
        }
        return firstOperator;
    }

    public static String getQuestion(){
        return firstNumber + " " + firstOperator + " " + secondNumber;
    }

    public static int getAnswer(){

        if (firstOperator.equals("+"))
            answer = firstNumber + secondNumber;
        else if (firstOperator.equals("-"))
            answer = Math.max(firstNumber, secondNumber) - Math.min(firstNumber, secondNumber);
        else if (firstOperator.equals("*"))
            answer = firstNumber * secondNumber;
        else if (firstOperator.equals("/"))
            answer = firstNumber / secondNumber;
        return answer;
    }

    public static int getStudentAnswer() {
        return studentAnswer;
    }

    public static String getCorrectFeedback(int studentAnswer) {
        int generateComment = 1 + secureRandom.nextInt(4);
        String result = "";
        if (studentAnswer == answer) {
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
        if (studentAnswer != answer) {
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

    public static int generateDifficultyLevel(int userChoice) {
        int difficultyLevel = 1;
        for (int i = 1; i < userChoice; i++) {
            difficulty = difficultyLevel;
            difficultyLevel *= 10;
        }
        return difficulty;
    }

    public static void userSelection(int userSelection){
        switch (userSelection){
            case 1 -> firstOperator = "+";
            case 2 -> firstOperator = "-";
            case 3 -> firstOperator = "*";
            case 4 -> firstOperator = "/";
            case 5 -> generateRandomOperators();
        }
    }

}
