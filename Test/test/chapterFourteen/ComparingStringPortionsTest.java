package chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingStringPortionsTest {
    ComparingStringPortions comparingStringPortions;

    @BeforeEach
    void setUp() {
        comparingStringPortions = new ComparingStringPortions();
    }

    @AfterEach
    void tearDown() {
        comparingStringPortions = null;
    }

    @Test
    void testToCompareStringPortions(){
        String firstWord = "Paulina";
        String secondWord = "Najafi";
        int firstStringIndex = 3;
        int secondStringIndex = 2;
        int numberOfCharacters = 4;
        boolean answer = comparingStringPortions.comparison(firstWord, secondWord, firstStringIndex,secondStringIndex,numberOfCharacters);
        assertFalse(answer);
    }
}