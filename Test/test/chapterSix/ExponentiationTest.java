package chapterSix;

import chapterSix.Exponentiation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {

    @Test
    void testThatFirstNumberCanBeCollected(){
        Exponentiation.setFirstInput(8);
        assertEquals(8, Exponentiation.getFirstInput());
    }

    @Test
    void testThatSecondNumberCanBeCollected(){
        Exponentiation.setSecondInput(2);
        assertEquals(2, Exponentiation.getSecondInput());
    }

    @Test
    void testThatANUmberToAPowerCanBeFound(){
        assertEquals(81, Exponentiation.integerPower(3,4));
    }
}