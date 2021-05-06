package chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingStringsTest {
    ComparingStrings comparingStrings;

    @BeforeEach
    void setUp() {
        comparingStrings = new ComparingStrings();
    }

    @AfterEach
    void tearDown() {
        comparingStrings = null;
    }

    @Test
    void testToCompareTwoStrings(){
        String firstWord = "Referee";
        String secondWord = "Heroism";
        String answer = comparingStrings.compare(firstWord, secondWord);
        assertEquals("First word is larger", answer);
    }
}