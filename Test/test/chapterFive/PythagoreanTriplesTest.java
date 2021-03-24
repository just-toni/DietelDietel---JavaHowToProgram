package chapterFive;

import chapterFive.PythagoreanTriples;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTriplesTest {
    PythagoreanTriples triples;

    @BeforeEach
    void setUp() {
        triples = new PythagoreanTriples();
    }

    @AfterEach
    void tearDown() {
        triples = null;
    }

    @Test
    void testThatAdjacentValueCanBeCollected(){
        int i = 4;
        triples.setAdjacent(i);
        assertEquals(4, triples.getAdjacent());
    }

    @Test
    void testThatAdjacentValueLessThanOneCantBeCollected(){
        int i = -4;
        triples.setAdjacent(i);
        assertEquals(0, triples.getAdjacent());
    }

    @Test
    void testThatOppositeValueCanBeCollected(){
        int j = 6;
        triples.setOpposite(j);
        assertEquals(6, triples.getOpposite());
    }

    @Test
    void testThatOppositeValueLessThanOneCantBeCollected(){
        int i = -6;
        triples.setAdjacent(i);
        assertEquals(0, triples.getAdjacent());
    }

    @Test
    void testThatHypotenuseValueCanBeCollected(){
        int k = 9;
        triples.setHypotenuse(k);
        assertEquals(6, triples.getHypotenuse());
    }

    @Test
    void testThatHypotenuseValueLessThanOneCantBeCollected(){
        int k = -6;
        triples.setHypotenuse(k);
        assertEquals(0, triples.getHypotenuse());
    }

    @Test
    void testToCalculateHypotenuse(){
//        int i = 4;
//        int j = 3;
//        int k = 5;
        assertEquals(true, triples.calculateHypotenuse(4,3, 5));
        assertEquals(false, triples.calculateHypotenuse(8,9,16));
    }
}