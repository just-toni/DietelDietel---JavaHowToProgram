package chapterSeven;

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
    void testToShuffleAnArray(){
        int[] bunch = {9,13,4,5,6,7};
        kata.shuffle(bunch);
    }

    @Test
    void testToSortArray(){
        int[] bunch = {1,13,34,5,6,7};
        kata.sortAsc(bunch);
    }
}