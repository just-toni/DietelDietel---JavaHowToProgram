package chapterEight;

public class TicTacToe {
    private Board gameBoard;

    public TicTacToe(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Board getBoard() {
        return gameBoard;
    }

    public String displayBoard() {
        gameBoard.visualizeBoard();
        return "";
    }
}
