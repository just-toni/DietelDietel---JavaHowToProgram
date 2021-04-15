package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen turtlePen) {
        pen = turtlePen;
        currentDirection = EAST;
        currentPosition = new Position(0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection){
            case EAST -> changeCurrentDirectionTo(SOUTH);
            case SOUTH -> changeCurrentDirectionTo(WEST);
            case WEST -> changeCurrentDirectionTo(NORTH);
            case NORTH -> changeCurrentDirectionTo(EAST);
        }
    }

    private void changeCurrentDirectionTo(Direction newDirection){
        currentDirection = newDirection;
    }

    public void moveForwardBy(int numberOfSteps) {
        if (currentDirection == EAST) {
            currentPosition.increaseColumnPositionBy(numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> changeCurrentDirectionTo(NORTH);
            case SOUTH -> changeCurrentDirectionTo(EAST);
            case WEST -> changeCurrentDirectionTo(SOUTH);
            case NORTH -> changeCurrentDirectionTo(WEST);
        }
    }

    public void moveDownwardsBy(int numberOfSteps) {
        if(currentDirection == SOUTH){
            currentPosition.increaseRowPositionBy(numberOfSteps);
        }
    }

    public void moveBackwardsBy(int numberOfSteps) {
        if(currentDirection == WEST){
            currentPosition.decreaseColumnPositionBy(numberOfSteps);
        }
    }

    public void moveUpwardsBy(int numberOfSteps) {
        if(currentDirection == NORTH){
            currentPosition.decreaseRowPositionBy(numberOfSteps);
        }
    }
}

