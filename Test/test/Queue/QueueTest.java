package Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void dequeueOneElement(){
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
    void findTotalNumberOfElements(){
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(89);
        assertEquals(4, queue.getTotalNumberOfElements());
    }

    @Test
    void checkIfQueueIsEmpty(){
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}