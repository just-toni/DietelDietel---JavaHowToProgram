package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {

    @Test
    void testThatNumberOfTimesCoinIsTossedIsRandom(){
        int heads = CoinToss.flipCoin();
        int tails = CoinToss.flipCoin();
        assertTrue(heads != tails);
    }

    @Test
    void testToDisplayFaceOfCoinTossed(){
        int face = 2;
        assertEquals(2, CoinToss.displayFace(face));
    }

    @Test
    void testToGetNumberOfTimesHeadsWasCounted(){
        assertEquals(0, CoinToss.getHeads());
    }

    @Test
    void testToGetNumberOfTimesTailsWasCounted(){
        assertEquals(0, CoinToss.getTails());
    }
}