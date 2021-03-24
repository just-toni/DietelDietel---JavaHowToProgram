package chapterSix;

import java.security.SecureRandom;

public class GuessNumber {

    SecureRandom random = new SecureRandom();
    private int randomNumber;

    public int generateRandomNumber() {
        randomNumber = 1 + random.nextInt(1000);
        return randomNumber;

    }

    public String getResult(int guessedNumber) {
        String result = "";
        if (randomNumber > guessedNumber) {
            result = "Too low, try again";
        } else if (randomNumber == guessedNumber) {
            result = "Congratulations, you guessed the number!";
        } else
            result = "Too high, try again";
        return result;
    }
}
