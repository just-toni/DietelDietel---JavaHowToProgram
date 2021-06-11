package Card;

import CardExceptions.StackOverFlowException;
import CardExceptions.StackUnderFlowException;
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
        assertEquals(2, deck.getTotalNumberOfCardsInDeck());
        assertEquals(card1, deck.peek());
        assertEquals(2, deck.getTotalNumberOfCardsInDeck());
    }

    @Test
    void testThatStackIsNotEmpty(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        deck.push(card1);
        deck.push(card2);
        assertFalse(deck.isEmpty());
    }

    @Test
    void testThatStackIsEmpty(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        deck.push(card1);
        deck.push(card2);
        deck.pop();
        deck.pop();
        assertTrue(deck.isEmpty());
    }

    @Test
    void testThatStackIsNotFull(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        deck.push(card1);
        deck.push(card2);
        assertFalse(deck.isFull());
    }

    @Test
    void testThatStackIsFull(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        Card card3 = new Card(FIVE, DIAMOND);
        Card card4 = new Card(SIX, DIAMOND);
        Card card5 = new Card(SEVEN, DIAMOND);
        Card card6 = new Card(EIGHT, DIAMOND);
        deck.push(card1);
        deck.push(card1);
        deck.push(card2);
        deck.push(card3);
        deck.push(card4);
        deck.push(card5);
        deck.push(card6);
        assertTrue(deck.isFull());
    }

    @Test
    void testForStackOverflow(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        Card card3 = new Card(FIVE, DIAMOND);
        Card card4 = new Card(SIX, DIAMOND);
        Card card5 = new Card(SEVEN, DIAMOND);
        Card card6 = new Card(EIGHT, DIAMOND);
        deck.push(card1);
        deck.push(card1);
        deck.push(card2);
        deck.push(card3);
        deck.push(card4);
        deck.push(card5);
        deck.push(card6);
        assertTrue(deck.isFull());
        assertEquals(7, deck.getTotalNumberOfCardsInDeck());
        Card card7 = new Card(NINE, DIAMOND);
        assertThrows(StackOverFlowException.class, ()->deck.push(card7));
    }

    @Test
    void testThatStackUnderflowOccurs(){
        Card card1 = new Card(THREE, DIAMOND);
        Card card2 = new Card(FOUR, DIAMOND);
        deck.push(card1);
        deck.push(card2);
        deck.pop();
        deck.pop();
        assertTrue(deck.isEmpty());
        assertThrows(StackUnderFlowException.class, ()->deck.pop());
    }
}