package chapterSix;

import chapterSix.GuessNumber2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;import static org.junit.jupiter.api.Assertions.assertTrue;

class GuessNumber2Test {
    GuessNumber2 guess2;

    @BeforeEach
    void setUp() {
        guess2 = new GuessNumber2();
    }

    @AfterEach
    void tearDown() {
        guess2 = null;
    }


    @Test
    void testThatNumberGeneratedIsBetweenOneAndFifteen(){
        int firstNumber = guess2.generateRandomNumber();
        int secondNumber = guess2.generateRandomNumber();
        assertTrue(firstNumber != secondNumber);
    }

    @Test
    void testThatAnswerLessThanGuessPrintsMessage(){
        int randomNumber = guess2.generateRandomNumber() - 7;
        assertEquals("Too low, try again", guess2.getResult(randomNumber));
    }

    @Test
    void testThatACorrectGuessPrintMessage(){
        int randomNumber = guess2.generateRandomNumber();
        assertEquals("Congratulations, you guessed the number!", guess2.getResult(randomNumber));
    }

    @Test
    void testThatAnswerGreaterThanGuessPrintsMessage(){
        int randomNumber = guess2.generateRandomNumber() + 7;
        assertEquals("Too high, try again", guess2.getResult(randomNumber));
    }

    @Test
    void testToDisplayMessageWhenNumberOfTriesIsLessThanTen(){
        int randomNumber = guess2.generateRandomNumber() + 7;
        assertEquals("Either you know the secret or you got lucky", guess2.getFeedback());
    }
}