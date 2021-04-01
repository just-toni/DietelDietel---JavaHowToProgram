package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToniArrayTest {
    ToniArray array;

    @BeforeEach
    void setUp() {
        array = new ToniArray();
    }

    @AfterEach
    void tearDown() {
        array = null;
    }

    @Test
    void testToSetArrayLength(){
        array.setArrayLength(7);
        assertEquals(7, array.getArrayLength());
    }

    @Test
    void testToCreatElementsInArray(){
        array.setArrayLength(5);
        int[] toni = new int [array.getArrayLength()];
        array.setArrayElements(toni);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, array.getArrayElements());
    }

    @Test
    void testToGetElementOfTheArrayByTheIndex(){
        array.setArrayLength(7);
        int[] toni = new int [array.getArrayLength()];
        array.setArrayElements(toni);
        array.setIndex(3);
        assertEquals(8, array.getElement());
    }
}