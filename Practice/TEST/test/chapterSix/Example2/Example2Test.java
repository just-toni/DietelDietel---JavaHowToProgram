package chapterSix.Example2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    private Example2 example;
    private Example2 example2;

    @BeforeEach
    void setUp() {
        example = new Example2();
        example2 = new Example2();
    }

    @AfterEach
    void tearDown() {
        example = null;
    }


    @DisplayName("Set Static variable with the class name")
    @Test
    void test1(){
        Example2.setInput(10);
        assertEquals(10, Example2.getInput());
    }
    //    @DisplayName("Set ")
    @Test
    void test2(){
        Example2.setInput(13);
        assertEquals(13, Example2.getInput());
        assertEquals(13, example.getInput());
        assertEquals(13, example2.getInput());
    }

}