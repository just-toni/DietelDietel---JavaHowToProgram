package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumbersTest {

    @Test
    void testToCreateComplexNumbers(){
        ComplexNumbers complexNumbers = new ComplexNumbers(3,4);
        assertEquals(3, complexNumbers.getRealNumbers());
        assertEquals(4, complexNumbers.getImaginaryNumbers());
    }

    @Test
    void testToAddComplexNumbers(){
        ComplexNumbers complexNumbers = new ComplexNumbers(3,4);
        ComplexNumbers complexNumbers2 = new ComplexNumbers(5,6);
        assertEquals("8.0 + 10.0i", ComplexNumbers.add(complexNumbers, complexNumbers2));
    }

    @Test
    void testToSubtractComplexNumbers(){
        ComplexNumbers complexNumbers = new ComplexNumbers(5,6);
        ComplexNumbers complexNumbers2 = new ComplexNumbers(3,4);
        assertEquals("2.0 + 2.0i", ComplexNumbers.subtract(complexNumbers, complexNumbers2));
    }

    @Test
    void testToMultiplyComplexNumbers(){
        ComplexNumbers complexNumbers = new ComplexNumbers(3,4);
        ComplexNumbers complexNumbers2 = new ComplexNumbers(5,6);
        assertEquals("-9.0 + 38.0i", ComplexNumbers.multiply(complexNumbers, complexNumbers2));
    }

}