package chapterFive;

import chapterFive.Sales;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    Sales calculator;

    @BeforeEach
    void setUp() {
        calculator = new Sales();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test

    void testThatQuantityCanBeCollected(){
        int quantity = 4;
        calculator.setQuantity(quantity);
        assertEquals(4, calculator.getQuantity());
    }

    @Test
    void testThatQuantityLessThanZeroCantCollected(){
        int quantity = -8;
        calculator.setQuantity(quantity);
        assertEquals(0, calculator.getQuantity());
    }

    @Test
    void testThatQuantityEqualToZeroCantBeCollected(){
        int quantity = 0;
        calculator.setQuantity(quantity);
        assertEquals(0, calculator.getQuantity());
    }

    @Test
    void testThatPriceCanBeCollected(){
        double price = 6.3;
        calculator.setPrice(price);
        assertEquals(6.3, calculator.getPrice());
    }

    @Test
    void testThatPriceBelowZeroCantBeCollected(){
        double price = -9.5;
        calculator.setPrice(price);
        assertEquals(0.0, calculator.getPrice());
    }

    @Test
    void testThatPriceEqualToZeroCantBeCollected(){
        double price = 0.0;
        calculator.setPrice(price);
        assertEquals(0.0, calculator.getPrice());
    }

   @Test
    void testToCalculatePriceTimesQuantity(){
        double price = 90.87;
        int quantity = 6;
        calculator.setPrice(price);
        calculator.setQuantity(quantity);
        double product = calculator.calculateProduct();
        assertEquals(545.22, product);
   }

    @Test
    void testToCalculatePriceTimesQuantityRepeatedly2(){
        calculator.setPrice(45.5);
        calculator.setQuantity(2);
        assertEquals(91, calculator.calculateProduct());

        calculator.setPrice(39);
        calculator.setQuantity(5);
        assertEquals(286.0, calculator.calculateProduct());

        calculator.setPrice(20.43);
        calculator.setQuantity(3);
        assertEquals(347.29, calculator.calculateProduct());

    }
}