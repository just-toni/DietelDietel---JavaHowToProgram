package chapterSix;

import chapterSix.ExerciseSixPointTwoEight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseSixPointTwoEightTest {

    @Test
    void testThatGradeEnteredPrintsPoints(){
        assertEquals(4, ExerciseSixPointTwoEight.qualityPoints(90));
        assertEquals(2, ExerciseSixPointTwoEight.qualityPoints(76));
        assertEquals(1, ExerciseSixPointTwoEight.qualityPoints(65));
        assertEquals(3, ExerciseSixPointTwoEight.qualityPoints(83));
    }

}