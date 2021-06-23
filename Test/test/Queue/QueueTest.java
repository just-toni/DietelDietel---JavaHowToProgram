package Queue;

import com.QueueExceptions.QueueOverflowException;
import com.QueueExceptions.QueueUnderflowException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue(8);
    }

    @AfterEach
    void tearDown() {
        queue = null;
    }

    @Test
    void enqueueOneElement(){
        queue.enqueue(4);
        assertEquals(4, queue.peekFirst());
    }

    @Test
    void enqueueMultipleElements(){
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(11);
        queue.enqueue(89);
        assertEquals(5, queue.peekFirst());
        assertEquals(89, queue.peekLast());
    }

    @Test
    void dequeueOneElement() throws QueueUnderflowException {
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(89);
        queue.dequeue();
        queue.dequeue();
        assertEquals(89, queue.peekLast());
        assertEquals(7 , queue.peekFirst());
    }

    @Test
    void findTotalNumberOfElements() throws QueueUnderflowException {
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(89);
        assertEquals(4, queue.getTotalNumberOfElements());
        queue.dequeue();
        assertEquals(3, queue.getTotalNumberOfElements());
    }

    @Test
    void checkIfQueueIsEmpty() throws QueueUnderflowException {
        queue.enqueue(76);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(0, queue.getTotalNumberOfElements());
        assertTrue(queue.isEmpty());
    }

    @Test
    void queueUnderflow() throws QueueUnderflowException {
        queue.enqueue(76);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(0, queue.getTotalNumberOfElements());
        try{
            queue.dequeue();
        }
        catch (QueueUnderflowException ex){
            System.out.println("Queue underflow");
        }
        assertThrows(QueueUnderflowException.class, ()-> queue.dequeue());
    }

    @Test
    void checkIfQueueIsFull() throws QueueOverflowException {
        queue.enqueue(76);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(36);
        queue.enqueue(16);
        queue.enqueue(71);
        queue.enqueue(763);
        queue.enqueue(60);
        assertEquals(8, queue.getTotalNumberOfElements());
        assertTrue(queue.isFull());
    }

    @Test
    void queueOverflow() throws QueueOverflowException {
        queue.enqueue(76);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(36);
        queue.enqueue(16);
        queue.enqueue(71);
        queue.enqueue(763);
        queue.enqueue(60);
        assertEquals(8, queue.getTotalNumberOfElements());
        try{
            queue.enqueue(75);
        }
        catch (QueueOverflowException ex){
            System.out.println("Queue overflow");
        }
        assertThrows(QueueOverflowException.class, ()-> queue.enqueue(75));
    }

    @Test
    void test(){
        Queue toniQueue = new Queue(7);
//        int[] elementArray = new int [7];
        toniQueue.enqueue(4);
        toniQueue.enqueue(3);
        toniQueue.dequeue();
//        System.out.println(toniQueue.dequeue());
        assertEquals(1, toniQueue.getTotalNumberOfElements());
        assertEquals(3, toniQueue.peekFirst());
        assertEquals(3, toniQueue.peekLast());
//        assertArrayEquals(new int[]{4,0,0,0,0,0,0}, toniQueue.toString());
        toniQueue.enqueue(8);
        toniQueue.enqueue(2);
        toniQueue.dequeue();
        assertEquals(2, toniQueue.getTotalNumberOfElements());
        toniQueue.enqueue(6);
        toniQueue.enqueue(2);
        toniQueue.enqueue(6);
        assertEquals(8, toniQueue.peekFirst());
        assertFalse(toniQueue.isFull());
        assertEquals(5, toniQueue.getTotalNumberOfElements());
        toniQueue.enqueue(4);
        toniQueue.enqueue(9);
        assertEquals(7, toniQueue.getTotalNumberOfElements());
    }

    @Test
    void test2(){
        queue.enqueue(1);
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(0);
        queue.enqueue(1);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
    }
}