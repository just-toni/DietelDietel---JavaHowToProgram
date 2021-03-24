package chapterFive;

import chapterFive.Factorials;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {
    Factorials factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorials();
    }

    @AfterEach
    void tearDown() {
        factorial = null;
    }


    @Test
    void testThatANumberCanBeCollected(){
        int input = 5;
        factorial.collectInput(input);
        assertEquals(5, factorial.getInput());
    }

    @Test
    void testThatANumberLessThanOneCantBeCollected(){
        int input = -9;
        factorial.collectInput(input);
        assertEquals(0, factorial.getInput());
    }

    @Test
    void testThatANumberGreaterThanTwentyCantBeCollected(){
        int input = 21;
        factorial.collectInput(input);
        assertEquals(0, factorial.getInput());
    }

    @Test
    void testToFindFactorialOfInputLessThanOrEqualsToTwenty() {
        int input = 5;
        factorial.calculateFactorial(input);
        assertEquals(120, factorial.getFactorial());
    }

    @Test
    void testThatFactorialInputGreaterThanTwenty() {
        int input = 21;
        factorial.calculateFactorial(input);
        assertEquals(0, factorial.getFactorial());
    }

}