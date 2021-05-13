package chapterEight;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegersTest {

    @Test
    void testThatIntegerCanBeParsed() {
        HugeIntegers hugeIntegers = new HugeIntegers();
        String number = "134543297689";
        hugeIntegers.parse(number);
        assertEquals(new BigInteger(number), hugeIntegers.getValue());
    }

    @Test
    void testThatIntegerCanBeAdded() {
        HugeIntegers firstHugeInteger = new HugeIntegers();
        HugeIntegers secondHugeInteger = new HugeIntegers();
        String firstNumber = "234";
        String secondNumber = "9821";
        firstHugeInteger.parse(firstNumber);
        secondHugeInteger.parse(secondNumber);
        assertEquals(new BigInteger(String.valueOf(10055)), HugeIntegers.add(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatIntegerCanBeSubtracted() {
        HugeIntegers firstHugeInteger = new HugeIntegers();
        HugeIntegers secondHugeInteger = new HugeIntegers();
        String firstNumber = "234";
        String secondNumber = "9821";
        firstHugeInteger.parse(firstNumber);
        secondHugeInteger.parse(secondNumber);
        assertEquals(new BigInteger(String.valueOf(-9587)), HugeIntegers.subtract(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatIntegerCanBeMultiplied() {
        HugeIntegers firstHugeInteger = new HugeIntegers();
        HugeIntegers secondHugeInteger = new HugeIntegers();
        String firstNumber = "2394";
        String secondNumber = "34";
        firstHugeInteger.parse(firstNumber);
        secondHugeInteger.parse(secondNumber);
        assertEquals(new BigInteger(String.valueOf(81396)), HugeIntegers.multiply(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatIntegerCanBeDivided() {
        HugeIntegers firstHugeInteger = new HugeIntegers();
        HugeIntegers secondHugeInteger = new HugeIntegers();
        String firstNumber = "2394";
        String secondNumber = "34";
        firstHugeInteger.parse(firstNumber);
        secondHugeInteger.parse(secondNumber);
        assertEquals(new BigInteger(String.valueOf(70)), HugeIntegers.divide(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatFirstIntegerIsEqualToAnother(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        HugeIntegers hugeIntegers = new HugeIntegers();
        String firstNumber = "34576879809";
        String secondNumber = "34576879809";
        hugeInteger1.parse(firstNumber);
        hugeIntegers.parse(secondNumber);
        assertTrue(hugeInteger1.isEqualTo(hugeIntegers));
    }

    @Test
    void testThatFirstIntegerIsNotEqualToAnother(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        HugeIntegers hugeInteger = new HugeIntegers();
        String firstNumber = "34576879809";
        String secondNumber = "3457687986709";
        hugeInteger1.parse(firstNumber);
        hugeInteger.parse(secondNumber);
        assertTrue(hugeInteger1.isNotEqualTo(hugeInteger));
    }

    @Test
    void testThatFirstIntegerIsGreaterThanAnother(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        HugeIntegers hugeInteger = new HugeIntegers();
        String firstNumber = "345768798043576899";
        String secondNumber = "3457687986709";
        hugeInteger1.parse(firstNumber);
        hugeInteger.parse(secondNumber);
        assertTrue(hugeInteger1.isGreaterThan(hugeInteger));
    }

    @Test
    void testThatFirstIntegerIsLesserThanAnother(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        HugeIntegers hugeInteger = new HugeIntegers();
        String firstNumber = "345768799";
        String secondNumber = "3457687986709";
        hugeInteger1.parse(firstNumber);
        hugeInteger.parse(secondNumber);
        assertTrue(hugeInteger1.isLesserThan(hugeInteger));
    }

    @Test
    void testThatFirstIntegerIsGreaterThanOrEqualToAnother(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        HugeIntegers hugeInteger = new HugeIntegers();
        String firstNumber = "345768798043576899";
        String secondNumber = "3457687986709";
        hugeInteger1.parse(firstNumber);
        hugeInteger.parse(secondNumber);
        assertTrue(hugeInteger1.isGreaterThanOrEqualTo(hugeInteger));
    }

    @Test
    void testThatFirstIntegerIsLesserThanOrEqualToAnother(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        HugeIntegers hugeInteger = new HugeIntegers();
        String firstNumber = "345768799";
        String secondNumber = "3457687986709";
        hugeInteger1.parse(firstNumber);
        hugeInteger.parse(secondNumber);
        assertTrue(hugeInteger1.isLesserThanOrEqualTo(hugeInteger));
    }

    @Test
    void testThatFirstIntegerIsZero(){
        HugeIntegers hugeInteger1 = new HugeIntegers();
        String firstNumber = "";
        hugeInteger1.parse(firstNumber);
        assertTrue(hugeInteger1.isZero());
    }

}