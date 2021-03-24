package chapterSix;

import chapterSix.CircleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {

    @Test
    void testThatRadiusOfACircleCanBeCollected(){
        CircleArea.setRadius(8);
        assertEquals(8, CircleArea.getRadius());
    }

    @Test
    void testThatAreaOfACircleCanBeFound(){
        assertEquals(147, CircleArea.circleArea(7));
    }

}