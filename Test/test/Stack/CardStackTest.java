package Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardStackTest {
    CardStack stack;

    @BeforeEach
    void setUp() {
        stack = new CardStack(52);
    }

    @AfterEach
    void tearDown() {
        stack = null;
    }

  @Test
    void pushOneElement_test(){
        stack.push(2);
        assertEquals(2, stack.peek());
  }

  @Test
    void pushTwoElement_test(){
        stack.push(2);
        stack.push(8);
        assertEquals(8, stack.peek());
        assertEquals(2, stack.getTotalNumberOfElement());
  }

  @Test
    void pushTwoElement_popOne_test(){
        stack.push(23);
        stack.push(12);

        assertEquals(12, stack.pop());
        assertEquals(23, stack.peek());
  }

  @Test
    void isNotEmpty_stackTest(){
        stack.push(45);
        stack.push(67);

      assertFalse(stack.isEmpty());
  }

    @Test
    void isEmpty_stackTest(){
        stack.push(4);
        stack.push(-1);
        stack.pop();
        stack.pop();
        assertEquals(0, stack.getTotalNumberOfElement());
        assertTrue(stack.isEmpty());
    }

    @Test
    void isFull_stackTest(){
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertTrue(stack.isFull());
    }

    @Test
    void isNotFull_stackTest(){
        stack.push(3);
        stack.push(4);
        assertFalse(stack.isFull());
    }

    @Test
    void stackOverflow_test(){
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(4, stack.getTotalNumberOfElement());
//        try{
//            stack.push(23);
//        }
//        catch (StackOverflowError stackOverflowError){
//            System.out.println("stat");
//        }
        assertThrows(StackOverflowError.class, ()-> stack.push(56));
    }

    @Test
    void stackUnderflow_test(){
        assertEquals(0, stack.getTotalNumberOfElement());
        assertTrue(stack.isEmpty());
        assertThrows(IllegalArgumentException.class, ()-> stack.pop());
    }
}