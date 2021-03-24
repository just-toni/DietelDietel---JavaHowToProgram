package chapterFive;

import chapterFive.TestDriller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {
    TestDriller kata = new TestDriller();

    @BeforeEach
    void setUp() {
        kata = new TestDriller();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    @DisplayName("Test for price per copy")
    void testThatNumberCollectedGivesPrice(){
        assertEquals(1500,kata.showPrice(1));
    }
}