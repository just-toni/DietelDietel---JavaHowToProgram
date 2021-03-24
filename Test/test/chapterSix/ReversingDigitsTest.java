package chapterSix;

import chapterSix.ReversingDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingDigitsTest {

@Test
    void testThatNumberInputtedCanBeReversed(){
    assertEquals(1367, ReversingDigits.reverseDigits(7631));
}


}