package turtleGraphics;

public class Position {
    @Override
    public String toString() {
        String toString = "Position\n";
        toString+= "Current Row Position: " + rowPosition + "\n";
        toString+= "Current Column Position: " + rowPosition;
        return toString;
    }

    @Override
    public boolean equals(Object anotherPosition) {
        //type
        if(anotherPosition.getClass() != this.getClass()){
            return false;
        }
        Position convertedPosition = (Position) anotherPosition;
        boolean columnsAreEqual = convertedPosition.columnPosition == this.columnPosition;
        boolean rowsAreEqual = convertedPosition.rowPosition == this.rowPosition;
        return columnsAreEqual && rowsAreEqual;
    }

    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition+= numberOfSteps;
    }

    public void increaseRowPositionBy(int numberOfSteps) {
        rowPosition+= numberOfSteps;
    }

    public void decreaseColumnPositionBy(int numberOfSteps) {
        columnPosition-= numberOfSteps;
    }

    public void decreaseRowPositionBy(int numberOfSteps) {
        rowPosition-= numberOfSteps;
    }
}
