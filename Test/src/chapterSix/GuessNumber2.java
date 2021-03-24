package chapterSix;

import java.security.SecureRandom;

public class GuessNumber2 {

    SecureRandom secureRandom = new SecureRandom();
    private int randomNumber;
    private int guessCounter;

    public int generateRandomNumber() {
        randomNumber = 1 + secureRandom.nextInt(1000);
        return randomNumber;

    }

    public String getResult(int guessedNumber) {
        String result;
        if (randomNumber > guessedNumber) {
            result = "Too low, try again";
        } else if (randomNumber == guessedNumber) {
            result = "Congratulations, you guessed the number!";
        } else
            result = "Too high, try again";
        return result;
    }

    public String getFeedback(){
        if(guessCounter < 10){
            return "Either you know the secret or you got lucky";
        }
        else if (guessCounter > 10){
            return "You should be able to do better!" + "\n" +
                    " Why should it take no more than 10 guesses?";
        }
        else
            return "Aha! you know the secret";
    }
}
