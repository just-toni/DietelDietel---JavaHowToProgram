package chapterSix;

import chapterSix.Multiples;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    @Test
    void testThatFirstNumberCanBeCollected(){
        Multiples.setFirstInput(8);
        assertEquals(8, Multiples.getFirstInput());
    }

    @Test
    void testThatSecondNumberCanBeCollected(){
        Multiples.setSecondInput(2);
        assertEquals(2, Multiples.getSecondInput());
    }

    @Test
    void testThatSecondNumberIsAMultipleOfTheFirst(){
        assertFalse(Multiples.isMultiple(4,6));
        assertTrue(Multiples.isMultiple(3,9));
    }

}