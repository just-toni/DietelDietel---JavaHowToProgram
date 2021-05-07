package chapterEight;

public class TicTacToe {
    private final Board gameBoard;
    private boolean lastPositionPlayedIsX;
    private final int positionToPlay;

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
}
