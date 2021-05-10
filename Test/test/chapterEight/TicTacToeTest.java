package chapterEight;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    Board  board;
    TicTacToe game;

    @BeforeEach
    void setUp() {
        board = new Board(3);
        game = new TicTacToe(board);
    }

    @AfterEach
    void tearDown() {
        board = null;
        game = null;
    }

    @Test
    void testThatAGameHasABoard(){
        assertNotNull(game.getBoard());
    }

    @Test
    void testThatABoardHasAGrid(){
        assertNotNull(board.getGrid());
    }

    @Test
    void testThatBoardCanBeVisualized(){
        assertEquals("""
                EMPTY EMPTY EMPTY 
                EMPTY EMPTY EMPTY 
                EMPTY EMPTY EMPTY 
                """, game.displayBoard());
    }

    @Test
    void testThatPlayerCanMakeAMove() throws GameOverException {
        game.makeMove(1);
        assertEquals(GameValue.X, game.getBoard().getGrid()[0][0]);
        assertEquals("""
                X EMPTY EMPTY 
                EMPTY EMPTY EMPTY  
                EMPTY EMPTY EMPTY 
                """, board.visualizeBoard());
        game.makeMove(5);
        assertEquals(GameValue.O, game.getBoard().getGrid()[1][1]);
        assertEquals("""
                X EMPTY EMPTY 
                EMPTY O EMPTY 
                EMPTY EMPTY EMPTY 
                """, board.visualizeBoard());
    }

    @Test
    void testThatPlayerCantMakeTheSameMoveTwice() throws GameOverException {
        game.makeMove(5);
        assertEquals(GameValue.X, game.getBoard().getGrid()[1][1]);
        game.makeMove(3);
        assertNotEquals(GameValue.X, game.getBoard().getGrid()[0][2]);
    }

    @Test
    void testThatPlayerCanOnlyPlayOnEmptySpaces() throws GameOverException {
        assertEquals(1, game.makeMove(6));
        assertEquals(-1, game.makeMove(6));
        assertEquals(1, game.makeMove(8));
        assertEquals(-1, game.makeMove(8));
        assertEquals(1, game.makeMove(1));
        assertEquals(-1, game.makeMove(1));
    }

    @Test
    void testThatGameIsWonWhenPlayerPlaysTheFirstRow() throws GameOverException {
        game.makeMove(1);
        assertEquals(GameValue.X, game.getBoard().getGrid()[0][0]);
        game.makeMove(4);
        assertEquals(GameValue.O, game.getBoard().getGrid()[0][1]);
        game.makeMove(2);
        assertEquals(GameValue.X, game.getBoard().getGrid()[0][2]);
        game.makeMove(8);
        assertEquals(GameValue.O, game.getBoard().getGrid()[2][1]);
        game.makeMove(3);
        assertEquals(GameValue.X, game.getBoard().getGrid()[0][0]);
        assertTrue(game.gameWon());
    }

}