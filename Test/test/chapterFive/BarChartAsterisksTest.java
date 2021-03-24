package chapterFive;


import chapterFive.BarChartAsterisks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarChartAsterisksTest {
    BarChartAsterisks asterisks;

    @BeforeEach
    void setUp() {
        asterisks = new BarChartAsterisks();
    }

    @AfterEach
    void tearDown() {
        asterisks = null;
    }

    @Test
    void testThatInputCanBeCollected(){
        int input = 4;
        asterisks.collectInput(input);
        assertEquals(4, asterisks.getInput());
    }

    @Test
    void testThatAsterisksCanBePrinted(){
        int input = 4;
        assertEquals("****", asterisks.printAsterisks(input));
    }
}