package chapterSix;

import chapterSix.Minimum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTest {

    @Test
    void testThatFirstCoordinateCanBeCollected(){
        double first = 11;
        Minimum.setFirstNumber(first);
        assertEquals(11, Minimum.getFirstNumber());
    }

    @Test
    void testThatSecondCoordinateCanBeCollected(){
        double first = 10;
        Minimum.setSecondNumber(first);
        assertEquals(10, Minimum.getSecondNumber());
    }

    @Test
    void testThatThirdCoordinateCanBeCollected(){
        double first = 1;
        Minimum.setThirdNumber(first);
        assertEquals(1, Minimum.getThirdCNumber());
    }

    @Test
    void testToFindMinimumOfThreeValues(){
        assertEquals(3, Minimum.minimum(3,4,5));
    }

}