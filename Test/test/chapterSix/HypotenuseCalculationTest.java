package chapterSix;

import chapterSix.HypotenuseCalculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculationTest {

    @Test
    void testThatFirstNumberCanBeCollected(){
        HypotenuseCalculation.setFirstInput(3.0);
        assertEquals(3.0, HypotenuseCalculation.getFirstInput());
    }

    @Test
    void testThatSecondNumberCanBeCollected(){
        HypotenuseCalculation.setSecondInput(4.0);
        assertEquals(4.0, HypotenuseCalculation.getSecondInput());
    }

    @Test
    void testToCalculateHypotenuseOfTwoSidesOfATriangle(){
        assertEquals(5.0, HypotenuseCalculation.calculateHypotenuse(3, 4));
        assertEquals(13.0, HypotenuseCalculation.calculateHypotenuse(12,5));
        assertEquals(17,HypotenuseCalculation.calculateHypotenuse(8, 15));
    }

}