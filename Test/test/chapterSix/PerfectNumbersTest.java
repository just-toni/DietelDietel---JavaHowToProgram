package chapterSix;

import chapterSix.PerfectNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    @Test
    void testThatANumberCollectedIsAPerfectNumber(){
        assertTrue(PerfectNumbers.isPerfect(6));
        assertFalse(PerfectNumbers.isPerfect(3));
        assertFalse(PerfectNumbers.isPerfect(2));
    }

    @Test
    void testThatFactorsOfAPerfectNumberCanBeGotten(){
        assertEquals("1,2,3", PerfectNumbers.getFactorsOfPerfectNumber(6));
    }

}