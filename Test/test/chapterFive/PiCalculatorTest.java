package chapterFive;

import chapterFive.PiCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiCalculatorTest {
    PiCalculator pi;

    @BeforeEach
    void setUp() {
        pi = new PiCalculator();
    }

    @AfterEach
    void tearDown() {
        pi = null;
    }

    @Test
    void testToCollectInput(){
        int input = 500;
        pi.collectInput(input);
        assertEquals(500, pi.getInput());
    }

    @Test
    void testThatInputLessThanOneCantBeCollected(){
        int input = -34;
        pi.collectInput(input);
        assertEquals(0, pi.getInput());
    }

    @Test
    void testThatInputGreaterThanTwoHundredThousandCantBeCollected(){
        int input = 568930;
        pi.collectInput(input);
        assertEquals(0, pi.getInput());
    }

    @Test
    void testToFindPiValueOfInputCollected(){
        int input = 2;
        pi.setPiValue(input);
        assertEquals(2.666666666666667, pi.getPiValue());
    }
    }
