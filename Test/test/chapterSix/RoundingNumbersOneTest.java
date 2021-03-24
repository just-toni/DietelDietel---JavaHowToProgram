package chapterSix;

import chapterSix.RoundingNumbersOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundingNumbersOneTest {

    @Test
    void testThatANumberCanBeRoundedUp(){
        double result = RoundingNumbersOne.roundNumber(8.9);
        assertEquals(9, result);
    }

    @Test
    void testThatANumberCanBeRoundedUpToTenth(){
        double result = RoundingNumbersOne.roundNumberToTenth(6.765);
        assertEquals(6.8, result);
    }

    @Test
    void testThatANumberCanBeRoundedUpToHundredth(){
        double result = RoundingNumbersOne.roundNumberToHundredth(65.657);
        assertEquals(65,66, result);
    }

    @Test
    void testThatANumberCanBeRoundedUpToThousandth(){
        double result = RoundingNumbersOne.roundNumberToThousandth(16.7);
        assertEquals(16.7, result);
    }
}