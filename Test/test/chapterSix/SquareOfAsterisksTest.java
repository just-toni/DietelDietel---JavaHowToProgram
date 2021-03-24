package chapterSix;

import chapterSix.SquareOfAsterisks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfAsterisksTest {

    @Test
    void testThatFirstNumberCanBeCollected(){
        SquareOfAsterisks.setFirstInput(8);
        assertEquals(8, SquareOfAsterisks.getFirstInput());
    }

    @Test
    void testThatNumberInputtedPrintsSquareOfAsterisks(){
        assertEquals("**\n**\n", SquareOfAsterisks.squareOfAsterisks(2));
    }

}