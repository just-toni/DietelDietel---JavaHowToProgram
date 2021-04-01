package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VLALTest {
    VLAL vargs;

    @BeforeEach
    void setUp() {
        vargs = new VLAL();
    }

    @AfterEach
    void tearDown() {
        vargs = null;
    }

    @Test
    void testThatProductOfNumbersCanBeCalculated(){
        int [] array = {2,4,6};
        int [] array2 = {5,3,7};
        int [] array3 = {1,8,9};
        assertEquals(48, vargs.product(array));
        assertEquals(105, vargs.product(array2));
        assertEquals(72, vargs.product(array3));
    }
}