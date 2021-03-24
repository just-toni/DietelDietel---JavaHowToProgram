package chapterSix;

import chapterSix.GCD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    private int getFirstNumber(){
        return 14;
    }

    private int getSecondNumber(){
        return 7;
    }

    @Test
    void testThatFirstNumberCanBeCollected(){
        GCD.setFirstInput(getFirstNumber());
        assertEquals(14, GCD.getFirstInput());
    }

    @Test
    void testThatSecondNumberCanBeCollected(){
        GCD.setSecondInput(getSecondNumber());
        assertEquals(7, GCD.getSecondInput());
    }

    @Test
    void testGCD(){
        assertEquals(8, GCD.calculateGCD(16,24));
        assertEquals(7, GCD.calculateGCD(42,49));
    }
}