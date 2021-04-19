package turtleGraphics;

public class Sketchpad {

    private final int [][] floor;

    public Sketchpad(int numberOfRows, int numberOfColumns){
        floor = new int[numberOfRows][numberOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }
}
