package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumbersTest {

    @Test
    void testToCreateRationalNumbers(){
        RationalNumbers rationalNumbers = new RationalNumbers(-15, 25);
        assertEquals(3, rationalNumbers.getNumerator());
        assertEquals(5, rationalNumbers.getDenominator());
    }

//    @Test
//    void testToAddRationalNumbers(){
//        RationalNumbers rationalNumbers1 = new RationalNumbers(1, 4);
//        RationalNumbers rationalNumbers2 = new RationalNumbers(1, 2);
//        assertEquals("3/4", RationalNumbers.add(rationalNumbers1, rationalNumbers2));
//    }

}