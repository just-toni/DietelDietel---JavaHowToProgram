package chapterSix;

import chapterSix.DistanceBetweenPoints;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceBetweenPointsTest {

    @Test
    void testThatFirstCoordinateCanBeCollected(){
        double first = 1;
        DistanceBetweenPoints.setFirstCoordinate(first);
        assertEquals(1, DistanceBetweenPoints.getFirstCoordinate());
    }

    @Test
    void testThatSecondCoordinateCanBeCollected(){
        double first = 1;
        DistanceBetweenPoints.setSecondCoordinate(first);
        assertEquals(1, DistanceBetweenPoints.getSecondCoordinate());
    }

    @Test
    void testThatThirdCoordinateCanBeCollected(){
        double first = 1;
        DistanceBetweenPoints.setThirdCoordinate(first);
        assertEquals(1, DistanceBetweenPoints.getThirdCoordinate());
    }

    @Test
    void testThatFourthCoordinateCanBeCollected(){
        double first = 1;
        DistanceBetweenPoints.setFourthCoordinate(first);
        assertEquals(1, DistanceBetweenPoints.getFourthCoordinate());
    }

    @Test
    void testToFindDifferenceBetweenPoints(){
        double distance = DistanceBetweenPoints.calculateDistance(-3.0, 6, 2.0, 20);
        assertEquals(2, distance);
    }

}