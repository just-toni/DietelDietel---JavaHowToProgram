package Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    DeckOfCards deck;

    @BeforeEach
    void setUp() {
        deck = new DeckOfCards();
    }

    @AfterEach
    void tearDown() {
        deck = null;
    }

    @Test
    void deckOfCardsCanBeGenerated_test(){
        deck.generateCardDeck();
//        assertEquals(0, deck.getCardDeck());
    }
}