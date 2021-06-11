package Card;

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

    @Test
    void testSameSuitValueEquals(){
        Card aceOfClubs = new Card(ACE, CLUB);
        Card threeOfClubs = new Card(THREE, CLUB);
        assertEquals(aceOfClubs, threeOfClubs);
        Card aceOfHearts = new Card(ACE, HEARTS);
        Card threeOfHearts = new Card(THREE, HEARTS);
        assertEquals(aceOfHearts, threeOfHearts);
        Card kingOfDiamonds = new Card(KING, DIAMOND);
        DeckOfCards deckOfCards = new DeckOfCards(3);
        assertNotEquals(kingOfDiamonds, deckOfCards);
    }
}