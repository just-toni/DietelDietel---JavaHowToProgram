package com.Exercises.chapterFour.Kata;

public class Kata {

    public double calculateAverage(int number1, int number2, int number3) {
        double average = 0.0;
        average = (number1 + number2 + number3) / 3.0;
        return average;
    }

    public double sum(int number1, int number2, int number3) {
        return (number1 + number2 + number3) + 0.0;
    }

    public String calculateGrade(int score) {
        if (score > 100)
            return "Invalid grade input";
        else if (score < 0)
            return "Invalid grade input";
        else if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else return "F";
    }

    public boolean calculateEven(int number){
        if(number % 2 == 0)
            return true;
        else return false;
    }

}
