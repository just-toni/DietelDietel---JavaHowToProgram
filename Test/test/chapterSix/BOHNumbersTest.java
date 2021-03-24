package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BOHNumbersTest {

    @Test
    void testThatDecimalCanBeConvertedToBinary(){
        int decimal = 3;
        assertEquals(11, BOHNumbers.covertToBinary(decimal));
        assertEquals(10, BOHNumbers.covertToBinary(2));
    }

    @Test
    void testThatDecimalCanBeConvertedToOctal(){
        int decimal = 3;
        assertEquals(3, BOHNumbers.covertToOctal(decimal));
        assertEquals(11, BOHNumbers.covertToOctal(9));
    }

    @Test
    void testThatDecimalCanBeConvertedToHexadecimal(){
        int decimal = 3;
        assertEquals("3", BOHNumbers.covertToHexadecimal(3));
        assertEquals("9", BOHNumbers.covertToHexadecimal(9));
        assertEquals("B", BOHNumbers.covertToHexadecimal(11));
    }

}