package com.Exercises.chapterSix.Kata;

import java.security.SecureRandom;

public class KataRandomizer {

    SecureRandom secureRandom = new SecureRandom();
    private int firstRandomNumber;
    private int secondRandomNumber;
    private String firstOperator;
    private int result;
    private int totalScore = 0;

    public void setFirstRandomNumber(){
        firstRandomNumber = 1 + secureRandom.nextInt(9);
    }

    public int getFirstRandomNumber(){
        return firstRandomNumber;
    }

    public void setSecondRandomNumber(){
        secondRandomNumber = 1 + secureRandom.nextInt(9);
    }

    public int getSecondRandomNumber(){
        return secondRandomNumber;
    }

    public String generateRandomOperators(){
        int randomOperator = secureRandom.nextInt(5);
        switch(randomOperator){
            case 1 -> firstOperator = "+";
            case 2 -> firstOperator = "-";
            case 3 -> firstOperator = "*";
            case 4 -> firstOperator = "/";
            case 5 -> firstOperator = "%";
        }
        return firstOperator;
    }

    public String getQuestion(){
        return firstRandomNumber + " " + firstOperator + " " + secondRandomNumber;
    }

    public int getResult(){
        if (firstOperator.equals("+"))
            result = firstRandomNumber + secondRandomNumber;
        else if (firstOperator.equals("-"))
            result = Math.max(firstRandomNumber, secondRandomNumber) - Math.min(firstRandomNumber, secondRandomNumber);
        else if (firstOperator.equals("*"))
            result = firstRandomNumber * secondRandomNumber;
        else if (firstOperator.equals("/"))
            result = firstRandomNumber / secondRandomNumber;
        else if (firstOperator.equals("%"))
            result =  firstRandomNumber % secondRandomNumber;
        return result;
    }

    public void confirmInput(int input){
        if(input == result){
            System.out.println("Correct answer!");
            totalScore++;
        }
        else System.out.println("Incorrect answer, try next question");
    }

    public int getTotalScore(){
        return totalScore;
    }

}
