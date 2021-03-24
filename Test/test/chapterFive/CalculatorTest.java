package chapterFive;

import chapterFive.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));
        assertEquals(7, calculator.add(4, 3));
        assertTrue(calculator.add(2, 3) == 5);
    }

    @Test
    @DisplayName("Testing for Multiplication")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(28, calculator.multiply(4, 7));
        assertEquals(45, calculator.multiply(9, 5));
    }

    @Test
    @DisplayName("Test for Subtraction")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.subtract(10, 3));
        assertEquals(5, calculator.subtract(2, 7));
    }

    @Test
    @DisplayName("Test for Division")
    void divideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.quotient(27, 3));
        assertEquals(10, calculator.quotient(100, 10));
    }

    @Test
    @DisplayName("Testing for float return")
    void divideTwoNumbersAndGiveAFloatAnswer() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.quotient(5, 2));
    }

    @Test
    @DisplayName("Division by zero gives zero")
    void divideByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.quotient(6, 0));
    }


}