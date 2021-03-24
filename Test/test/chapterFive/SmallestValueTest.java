package chapterFive;

import chapterFive.SmallestValue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestValueTest {
    SmallestValue checker;

    @BeforeEach
    void setUp() {
        checker = new SmallestValue();
    }

    @AfterEach
    void tearDown() {
        checker = null;
    }

    @Test
    @DisplayName("Test for number of values collected")
    void testThatNumberInputtedIsTheNumberOfValuesToBeEntered(){
        int input = 4;
        checker.collectInput(input);
        assertEquals(4, checker.getInput());
    }

    @Test
    @DisplayName("Test that number of values entered can't be less than or equal to zero")
    void testThatNumberInputtedIsNotLessThanOrEqualToZero(){
        int input = -9;
        input = 0;
        checker.collectInput(input);
        assertEquals(0, checker.getInput());
        assertEquals(0, checker.getInput());
    }

}