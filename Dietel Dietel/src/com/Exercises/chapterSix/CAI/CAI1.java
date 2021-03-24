package com.Exercises.chapterSix.CAI;

import java.security.SecureRandom;

public class CAI1 {

    SecureRandom secureRandom = new SecureRandom();
    private int firstRandomNumber;
    private int secondRandomNumber;
    private int answer;

    public void generateRandomNumber(){
        firstRandomNumber = 1 + secureRandom.nextInt(9);
        secondRandomNumber = 1 + secureRandom.nextInt(9);
    }

    public int getFirstRandomNumber(){
        return firstRandomNumber;
    }

    public int getSecondRandomNumber(){
        return secondRandomNumber;
    }

    public String getQuestion(){
        return "How much is " + firstRandomNumber + " times " + secondRandomNumber;
    }

    public int getAnswer(){
        return answer;
    }

    public int multiply(){
        return firstRandomNumber * secondRandomNumber;
    }

    public String getStudentFeedback(){
        if(answer == multiply()){
            return "Very good!";
        }
        else
            return "No. Please try again.";
    }

    public void generateNewQuestion(){
        if(answer == multiply()) {
            generateRandomNumber();
        }
    }
}
