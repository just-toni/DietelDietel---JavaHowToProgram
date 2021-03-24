package chapterSix;

import chapterSix.SeparatingDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatingDigitsTest {

    @Test
    void testThatFirstNumberCanBeCollected(){
        SeparatingDigits.setFirstInput(8);
        assertEquals(8, SeparatingDigits.getFirstInput());
    }

    @Test
    void testThatSecondNumberCanBeCollected(){
        SeparatingDigits.setSecondInput(2);
        assertEquals(2, SeparatingDigits.getSecondInput());
    }

    @Test
    void testThatDivisionOfTwoNumbersCanBeCalculated(){
        assertEquals(2,SeparatingDigits.calculateQuotient(4,2));
    }

    @Test
    void testThatDivisionOfTwoNumbersGivesRemainder(){
        assertEquals(4, SeparatingDigits.calculateReminder(9,5));
        assertEquals(2, SeparatingDigits.calculateReminder(8,3));
    }

    @Test
    void testThatNumberCollectedCanBeSeparated(){
        assertEquals("4  5", SeparatingDigits.displayDigits(45));
    }

}