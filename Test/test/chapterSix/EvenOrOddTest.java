package chapterSix;

import chapterSix.EvenOrOdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void testThatFirstNumberCanBeCollected(){
        EvenOrOdd.setFirstInput(8);
        assertEquals(8, EvenOrOdd.getFirstInput());
    }


    @Test
    void testThatSecondNumberIsAMultipleOfTheFirst(){
        assertTrue(EvenOrOdd.isEven(4));
        assertFalse(EvenOrOdd.isEven(3));
    }

}