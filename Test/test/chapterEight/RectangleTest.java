package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToVerifyWidthMustBeBetweenGivenRange(){
        float width = 8;
        Rectangle.setWidth(width);
        assertEquals(8, Rectangle.getWidth());
    }

    @Test
    void testThatWidthCantBeLessThanZero(){
        float width3 = -9;
        Rectangle.setWidth(width3);
        assertEquals(1, Rectangle.getWidth());
    }

    @Test
    void testThatWidthCantBeGreaterThanTwenty(){
        float width2 = 345;
        Rectangle.setWidth(width2);
        assertEquals(1, Rectangle.getWidth());
    }

    @Test
    void testToVerifyLengthMustBeBetweenGivenRange(){
        float length = 8;
        Rectangle.setLength(length);
        assertEquals(8, Rectangle.getLength());
    }

    @Test
    void testThatLengthCantBeGreaterThanTwenty(){
        float length2 = 345;
        Rectangle.setLength(length2);
        assertEquals(1, Rectangle.getLength());
    }

    @Test
    void testThatLengthCantBeLessThanZero(){
        float length3 = -9;
        Rectangle.setLength(length3);
        assertEquals(1, Rectangle.getLength());
    }

    @Test
    void testToCalculatePerimeterOfRectangle(){
        float length = 8;
        float width = 4;
        assertEquals(24, Rectangle.calculatePerimeter(length, width));
    }

    @Test
    void testToCalculateAreaOfRectangle(){
        float length = 8;
        float width = 4;
        assertEquals(32, Rectangle.calculateArea(length, width));
    }

}