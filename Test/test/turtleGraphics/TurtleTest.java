package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen pen2;
    Turtle turtle;

    @BeforeEach
    void StartAllTestWIth() {
        pen = new Pen();
        pen2 = new Pen();
        turtle = new Turtle(pen);

    }
    @Test
    void turtleHasAPen_test(){
        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(turtle.getPen(), pen2);
    }

    @Test
    void turtleCanMovePenUp_test() {
        //when
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    void turtleCanMovePenDown_test(){
        assertTrue(turtle.isPenUp());
        //when
        turtle.movePenDown();
        //assert
        assertFalse(turtle.isPenUp());
    }

    @Test
    void turtleCanMoveRightWhileFacingEast_test(){
        //given
        assertSame(EAST, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveRightWhileFacingSouth_test(){
        //given
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveRightWhileFacingWest_test(){
        //given
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveRightWhileFacingNorth_test(){
        //given
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveLeftWhileFacingEast_test(){
        //given
        assertSame(EAST, turtle.getCurrentDirection());
        //when
        turtle.turnLeft();
        //assert
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveLeftWhileFacingNorth_test(){
        //given
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        //when
        turtle.turnLeft();
        //assert
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveLeftWhileFacingWest_test(){
        //given
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        //when
        turtle.turnLeft();
        //assert
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveLeftWhileFacingSouth_test(){
        //given
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        //when
        turtle.turnLeft();
        //assert
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast(){
        //given
        assertSame(EAST, turtle.getCurrentDirection());
        //when
        turtle.moveForwardBy(5);
        // assert
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveDownwardsFacingSouth(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveDownwardsBy(3);
        assertEquals(new Position(3, 5), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveBackwardsFacingWest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(9);
        assertEquals(new Position(0, 9), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveDownwardsBy(3);
        assertEquals(new Position(3, 9), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveBackwardsBy(5);
        assertEquals(new Position(3,4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveUpwardsFacingNorth_test(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(9);
        assertEquals(new Position(0, 9), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveDownwardsBy(3);
        assertEquals(new Position(3, 9), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveBackwardsBy(5);
        assertEquals(new Position(3,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.moveUpwardsBy(1);
        assertEquals(new Position(2,4), turtle.getCurrentPosition());
    }

}
