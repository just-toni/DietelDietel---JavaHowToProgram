package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumbersTest {

    @Test
    void testToCreateRationalNumbers(){
        RationalNumbers rationalNumbers = new RationalNumbers(-15, 25);
        assertEquals(-3, rationalNumbers.getNumerator());
        assertEquals(5, rationalNumbers.getDenominator());
    }

    @Test
    void testToAddRationalNumbers(){
        RationalNumbers rationalNumbers1 = new RationalNumbers(1, 4);
        RationalNumbers rationalNumbers2 = new RationalNumbers(1, 2);
        RationalNumbers rational = RationalNumbers.add(rationalNumbers1, rationalNumbers2);
        assertEquals(3, rational.getNumerator());
        assertEquals(4, rational.getDenominator());
    }

    @Test
    void testToSubtractRationalNumbers(){
        RationalNumbers rationalNumbers1 = new RationalNumbers(1, 2);
        RationalNumbers rationalNumbers2 = new RationalNumbers(1, 4);
        RationalNumbers rational = RationalNumbers.subtract(rationalNumbers1, rationalNumbers2);
        assertEquals(1, rational.getNumerator());
        assertEquals(4, rational.getDenominator());
    }

    @Test
    void testToMultiplyRationalNumbers(){
        RationalNumbers rationalNumbers1 = new RationalNumbers(1, 4);
        RationalNumbers rationalNumbers2 = new RationalNumbers(1, 2);
        RationalNumbers rational = RationalNumbers.multiply(rationalNumbers1, rationalNumbers2);
        assertEquals(1, rational.getNumerator());
        assertEquals(8, rational.getDenominator());
    }

    @Test
    void testToDivideRationalNumbers(){
        RationalNumbers rationalNumbers1 = new RationalNumbers(1, 4);
        RationalNumbers rationalNumbers2 = new RationalNumbers(1, 2);
        RationalNumbers rational = RationalNumbers.divide(rationalNumbers1, rationalNumbers2);
        assertEquals(1, rational.getNumerator());
        assertEquals(2, rational.getDenominator());
    }

}