package chapterSix;

import chapterSix.Factors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {
    Factors factors;

    @BeforeEach
    void setUp() {
        factors = new Factors();
    }

    @AfterEach
    void tearDown() {
        factors = null;
    }

    @Test
    void testThatFactorsOfAGivenNumberCanBeFound(){
        assertEquals("1 2 4 8", factors.findFactorsOfANUmber(8));
        assertEquals("1 2 4 8 8 4 2 1", factors.findFactors(8));
    }
}