package chapterEight;

import FirstSetOfTddPractice.GasMileage;

import java.util.Arrays;

public class Board {

    private GameValue[][] grid;

    public Board(int gridNumber) {
        grid = new GameValue[gridNumber][gridNumber];
        for(int row = 0; row < grid.length; row++){
            Arrays.fill(grid[row], GameValue.EMPTY);
        }
    }

    public GameValue[][] getGrid() {
        return grid;
    }

    public String visualizeBoard() {
        String result = "";
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                result += grid[row][column] + " ";
            }
           result += '\n';
        }
        return result;
    }


}
