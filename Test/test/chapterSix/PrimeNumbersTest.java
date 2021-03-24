package chapterSix;

import chapterSix.PrimeNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void testToCheckWhetherNumberEnteredIsAPrimeNumber(){
        assertTrue(PrimeNumbers.isPrimeUsingHalf(53));
        assertTrue(PrimeNumbers.isPrimeUsingHalf(11));
        assertFalse(PrimeNumbers.isPrimeUsingHalf(8));
        assertFalse(PrimeNumbers.isPrimeUsingSquareRoot(16));
        assertTrue(PrimeNumbers.isPrimeUsingSquareRoot(53));
        assertTrue(PrimeNumbers.isPrimeUsingSquareRoot(11));
    }

}