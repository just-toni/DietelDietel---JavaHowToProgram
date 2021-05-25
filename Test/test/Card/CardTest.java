package Card;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Card.Faces.*;
import static Card.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testThatACardWithSuitsCanBeCreated(){
        Card card = new Card (ACE, HEARTS);
        assertEquals(HEARTS ,card.getSuits());
    }

    @Test
    void testThatACardWithAFaceCanBeCreated(){
        Card card = new Card(JACK, DIAMOND);
        assertEquals(JACK ,card.getFaces());
    }

    @Test
    void testThatACardWithBothSuitsAndFacesCanBeCreated(){
        Card card = new Card(KING, SPADES);
        assertEquals("KING OF SPADES", card.toString());
    }
}