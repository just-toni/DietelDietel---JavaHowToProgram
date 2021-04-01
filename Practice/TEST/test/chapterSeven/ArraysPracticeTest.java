package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysPracticeTest {
    ArraysPractice array;

    @BeforeEach
    void setUp() {
        array = new ArraysPractice();
    }

    @AfterEach
    void tearDown() {
        array = null;
    }

    @DisplayName("Test to initialize array")
    @Test
    void test1(){
        array.setLengthOfArray(8);
        int[] hype = new int[array.getLengthOfArray()];
        assertEquals(8, hype.length);
    }

    @DisplayName("Test that negative number cant  initialize array")
    @Test
    void test2(){
        array.setLengthOfArray(-98);
        int[] hype = new int[array.getLengthOfArray()];
        assertEquals(0, hype.length);
    }

    @DisplayName("Test to access elements in an array")
    @Test
    void test3(){
        array.setLengthOfArray(8);
        int[] hype = new int[array.getLengthOfArray()];
        assertEquals(8, hype.length);
    }
}