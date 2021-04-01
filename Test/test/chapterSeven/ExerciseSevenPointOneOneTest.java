package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseSevenPointOneOneTest {
    ExerciseSevenPointOneOne array;

    @BeforeEach
    void setUp() {
        array = new ExerciseSevenPointOneOne();
    }

    @AfterEach
    void tearDown() {
        array = null;
    }

    @Test
    void testThatElementsOfAnArrayHaveZeroValue(){
        int [] input = new int[10];
        array.setElements(input);
        assertArrayEquals(new int []{0,0,0,0,0,0,0,0,0,0}, array.getElements());
    }

    @Test
    void testThatOneCanBeAddedToAllElementsOfTheArray(){
        int [] input2 = new int[15];
        array.incrementElements(input2);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, array.getIncrementedElements());
    }

    @Test
    void testToDisplayBestFiveScoresOfTheArray(){
        int [] input2 = new int[15];
        array.bestScores(input2);
//        assertArrayEquals(new int[]{11,12,13,14,15}, array.displayBestScores());
    }
}