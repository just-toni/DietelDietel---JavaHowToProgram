package chapterEight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TicTacToe {
    private final Board gameBoard;
    private boolean lastPositionPlayedIsX;
    private final int positionToPlay;
    private boolean gameWon;

    public TicTacToe(Board gameBoard) {
        this.gameBoard = gameBoard;
        lastPositionPlayedIsX = false;
        positionToPlay = 0;
    }

    public Board getBoard() {
        return gameBoard;
    }

    public String displayBoard() {
        return gameBoard.visualizeBoard();
    }

    public int makeMove(int positionToPlay) throws GameOverException {
        if (isBoardFull()) throw new GameOverException();
        validatePosition(positionToPlay);
        positionToPlay -= 1;
        int row = positionToPlay / 3;
        int column = positionToPlay % 3;
        return checkLastPlayedValue(row, column);
    }

    private int checkLastPlayedValue(int row, int column) {
        GameValue [][] grid = gameBoard.getGrid();
        if(grid[row][column] == GameValue.EMPTY){
            if(lastPositionPlayedIsX){
                grid[row][column] = GameValue.O;
                lastPositionPlayedIsX = false;
            }
            else {
                grid[row][column] = GameValue.X;
                lastPositionPlayedIsX = true;
            }
            return 1;
        }
//        throw new IllegalArgumentException("Position " + positionToPlay + " has already been played");
        return -1;
    }

    private void validatePosition(int positionToPlay) {
        if (positionToPlay > 9 || positionToPlay < 1) throw new IllegalArgumentException("Position must be between values of 1 and 9");
    }

    private boolean isBoardFull() {
        GameValue [][] grid = gameBoard.getGrid();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if(grid[row][column] == GameValue.EMPTY)
                    return false;
            }
        }
        return true;
    }

    public boolean gameWon() {
        checkHorizontalRow();
        checkLeftDiagonal();
        checkRightDiagonal();
        return gameWon;
    }

    private void checkRightDiagonal() {
        GameValue [][] grid = gameBoard.getGrid();
        for (int i = 0; i < grid.length; i++) {
            int row = 2;
            int column = 0;
            Set<GameValue> results = new HashSet<>();
            while(row >= 0 && column <= 2){
                results.add(grid[row][column]);
                row--;
                column++;
            }
            if (!results.contains(GameValue.EMPTY)){
                if(results.size() == 1){
                    gameWon = true;
                    return;
                }
            }
        }
    }

    private void checkLeftDiagonal() {
        GameValue [][] grid = gameBoard.getGrid();
        for (int i = 0; i < grid.length; i++) {
            int row = 0;
            int column = 0;
            Set<GameValue> results = new HashSet<>();
            while(row < 3 && column < 3){
                results.add(grid[row][column]);
                row++;
                column++;
            }
            if (!results.contains(GameValue.EMPTY)){
                if(results.size() == 1){
                    gameWon = true;
                    return;
                }
            }
        }
    }

    private void checkHorizontalRow() {
        GameValue [][] grid = gameBoard.getGrid();
        for (int row = 0; row < grid.length; row++) {
            Set<GameValue> values = new HashSet<>(Arrays.asList(GameValue.values()));
            if(!values.contains(GameValue.EMPTY)){
                if(values.size() == 1){
                    this.gameWon = true;
                    return;
                }
            }
        }
    }
}
