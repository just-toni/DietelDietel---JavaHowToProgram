package com.Exercises.chapterSix.GuessNumber;

import java.security.SecureRandom;

public class GuessNumber2 {

    SecureRandom random = new SecureRandom();
    private int randomNumber;
    private int numberOfGuesses = 0;
    private boolean isRight;

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
                isRight = true;
            }
        }
        numberOfGuesses++;
        return result;
    }

    public String displayMessage(){
        String message = "";
        if(isRight) {
            if (numberOfGuesses < 10) {
                message = "Either you know the secret or you got lucky";
            }
            else {
                if (numberOfGuesses == 10) {
                    message = "Aha! you know the secret";
                }
                else {
                    message = "You should be able to do better! Why should it take no more than 10 guesses?";
                }
            }
        }
        return message;
    }


    public void getNumberOfGuesses(int numberOfGuesses){
        this.numberOfGuesses = numberOfGuesses;
    }
}
