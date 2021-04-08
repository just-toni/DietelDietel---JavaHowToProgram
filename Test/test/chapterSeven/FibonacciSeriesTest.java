package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

    @Test
    void calculateFibonacci_test(){
        FibonacciSeries.calculateFibonacci(4);
        assertEquals(5, FibonacciSeries.getFibonacci());
    }

}