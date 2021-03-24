package com.Exercises.chapterSix.GuessNumber;

import java.security.SecureRandom;

public class GuessNumber {

    SecureRandom random = new SecureRandom();
    private int randomNumber;

    public void generateRandomNumber() {
        randomNumber = 1 + random.nextInt(9);
    }

    public int getRandomNumber(){
        return randomNumber;
    }

    public String guessTheNumber(int guess) {
        String result;
        if (guess < randomNumber) {
            result = "Too low, try again";
        } else {
            if (guess > randomNumber) {
                result = "Too high, try again";
            } else {
                result = "Congratulations. You guessed the number!";
            }
        }
        return result;
    }
}
