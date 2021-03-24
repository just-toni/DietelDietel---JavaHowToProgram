package com.Exercises.chapterSix.Kata;

import java.security.SecureRandom;

public class KataRandomizer2 {

    SecureRandom secureRandom = new SecureRandom();
    private int firstRandomNumber;
    private int secondRandomNumber;
    private int thirdRandomNumber;
    private String firstOperator;
    private String secondOperator;
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

    public void setThirdRandomNumber(){
        thirdRandomNumber = 1 + secureRandom.nextInt(9);
    }

    public int getThirdRandomNumber(){
        return thirdRandomNumber;
    }

    public String generateRandomFirstOperators(){
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

    public String generateRandomSecondOperators(){
        int randomOperator = secureRandom.nextInt(5);
        switch(randomOperator){
            case 1 -> secondOperator = "+";
            case 2 -> secondOperator = "-";
            case 3 -> secondOperator = "*";
            case 4 -> secondOperator = "/";
            case 5 -> secondOperator = "%";
        }
        return secondOperator;
    }

    public String getQuestion(){
        return firstRandomNumber + " " + firstOperator + " " + secondRandomNumber + " " + secondOperator + " " + thirdRandomNumber;
    }

    public int getFirstResult(){
        switch (firstOperator) {
            case "+" -> result = firstRandomNumber + secondRandomNumber;
            case "-" -> result = Math.max(firstRandomNumber, secondRandomNumber) - Math.min(firstRandomNumber, secondRandomNumber);
            case "*" -> result = firstRandomNumber * secondRandomNumber;
            case "/" -> result = firstRandomNumber / secondRandomNumber;
            case "%" -> result = firstRandomNumber % secondRandomNumber;
        }
        return result;
    }

    public int getSecondResult(){
        switch (secondOperator) {
            case "+" -> result += thirdRandomNumber;
            case "-" -> result -= thirdRandomNumber;
            case "*" -> result *= thirdRandomNumber;
            case "/" -> result /= thirdRandomNumber;
            case "%" -> result %= thirdRandomNumber;
        }
        return result;
    }

    public void confirmInput(int input){
        if(input == result){
            System.out.println("Correct answer!");
            totalScore++;
        }
        else System.out.println("Incorrect answer");

    }

    public int getTotalScore(){
        return totalScore;
    }
}
