package chapterSix;

import chapterSix.Kata;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    Kata kata;

    @BeforeEach
    void setUp() {
        kata = new Kata();
    }

    @AfterEach
    void tearDown() {
        kata = null;
    }

    @Test
    void testToFindSumOfArray(){
        int [] array = {1,2,3,4,5};
        int sum = kata.calculateSum(array);
        assertEquals(15, sum);
    }

    @Test
    void testToFindAverageOfArray(){
        int[] array = {1,2,3,4,5};
        int average = kata.calculateAverage(array);
        assertEquals(3, average);
    }

    @Test
    void testToFindMinimumOfArray(){
        int[] array = {3,2,3,4,5};
        int minimum = kata.calculateMinimum(array);
        assertEquals(2, minimum);
    }

    @Test
    void testToFindMaximumOfArray(){
        int[] array = {1,2,4,6,3};
        int maximum = kata.calculateMaximum(array);
        assertEquals(6, maximum);
    }

    @Test
    void testToFindMaximumSumCombinationOfAnArray(){
        int[] array = {1,2,3,4,5};
        int maxSum = kata.calculateMaxSum(array);
        assertEquals(14, maxSum);
    }

    @Test
    void testToFindMinimumSumCombinationOfAnArray(){
        int[] array = {1,2,3,4,5};
        int minSum = kata.calculateMinSum(array);
        assertEquals(10, minSum);
    }
}