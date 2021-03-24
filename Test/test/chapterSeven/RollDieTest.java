package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollDieTest {

    @Test
    void testThatNUmberOfTimesDieRollsIsRandom(){
        assertNotEquals(RollDie.generateRandomFace(), RollDie.generateRandomFace());
    }

    @Test
    void testToCountNumberOfTimesDieIsRolled(){
        RollDie.generateRandomFace();
        assertEquals(1, RollDie.countGeneratedFaces());
    }

    @Test
    void testToDisplayFace(){
        RollDie.generateRandomFace();
        int count = RollDie.countGeneratedFaces();
//        assertEquals(1, RollDie.displayFace(count));
    }

}