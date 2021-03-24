package chapterSix;

import chapterSix.GuessNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {
    GuessNumber guess;

    @BeforeEach
    void setUp() {
        guess = new GuessNumber();
    }

    @AfterEach
    void tearDown() {
        guess = null;
    }

    @Test
    void testThatNumberGeneratedIsBetweenOneAndFifteen(){
        int firstNumber = guess.generateRandomNumber();
        int secondNumber = guess.generateRandomNumber();
        assertTrue(firstNumber != secondNumber);
    }

    @Test
    void testThatAnswerLessThanGuessPrintsMessage(){
        int randomNumber = guess.generateRandomNumber() - 7;
        assertEquals("Too low, try again", guess.getResult(randomNumber));
    }
    
    @Test
    void testThatACorrectGuessPrintMessage(){
        int randomNumber = guess.generateRandomNumber();
        assertEquals("Congratulations, you guessed the number!", guess.getResult(randomNumber));
    }

    @Test
    void testThatAnswerGreaterThanGuessPrintsMessage(){
        int randomNumber = guess.generateRandomNumber() + 7;
        assertEquals("Too high, try again", guess.getResult(randomNumber));
    }
}
