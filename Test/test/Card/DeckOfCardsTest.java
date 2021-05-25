package Card;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Card.Faces.*;
import static Card.Suit.DIAMOND;
import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {
    Card card;
    DeckOfCards deck;

    @BeforeEach
    void setUp() {
        card = new Card(ACE, DIAMOND);
        deck = new DeckOfCards(7);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCardDeckHasAFixedSize(){
        assertEquals(7, deck.getSize());
    }

    @Test
    void testThatCardCanBePushedIntoDeck(){
        Card card1 = new Card(THREE, DIAMOND);
        deck.push(card);
        deck.push(card1);
        assertEquals(2,deck.getTotalNumberOfCardsInDeck());
    }

    @Test
    void testThatLastCardPushedIntoDeckCanBePeeked(){
        Card card1 = new Card(THREE, DIAMOND);
        deck.push(card);
        deck.push(card1);
        assertEquals(2,deck.getTotalNumberOfCardsInDeck());
        assertEquals(card1, deck.peek());
    }

    @Test
    void testThatCardCanBePulledFromADeck(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        deck.push(card);
        deck.push(card1);
        deck.push(card2);
        assertEquals(3,deck.getTotalNumberOfCardsInDeck());
        deck.pop();
        assertEquals(card1, deck.peek());
        assertEquals(2, deck.getTotalNumberOfCardsInDeck());
    }
}