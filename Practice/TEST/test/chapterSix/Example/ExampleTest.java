package chapterSix.Example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    Example example;
    Example example2;

    @BeforeEach
    void setUp() {
        example = new Example();
        example2 = new Example();
    }

    @AfterEach
    void tearDown() {
        example = null;
        example2 = null;
    }

    @Test
    @DisplayName("class name can call static methods and creates a static variable")
    void test1(){
        int number = 24;
        Example.setNumber1(number);
        assertEquals(24, Example.getNumber1());
    }

    @Test
    @DisplayName("non static method can set and get a static variable")
    void test2(){
        int number = 25;
        example.setNumber1(number);
        assertEquals(25, example.getNumber1());
    }

    @Test
    @DisplayName("Non static method can get a static variable")
    void test3(){
        int number = 24;
        Example.setNumber1(number);
        assertEquals(24, example.getNumber1());
    }

    @Test
    @DisplayName("a non static method can change the value of a static variable and all the objects are affected by it")
    void test4(){
        int number = 24;
        Example.setNumber1(number);
        //the object of the class tries to change the variable by calling the static method setNumber1()
        example2.setNumber1(30);
        assertEquals(30, example2.getNumber1());
        assertEquals(30, example.getNumber1());
    }

    @Test
    @DisplayName("a non static method can set and get a non static variable")
    void test5(){
        //comparison of static and non-static methods
        int number2 = 12;
        example.setNumber2(number2);
        assertEquals(12, example.getNumber2());
    }

    @Test
    @DisplayName("an object can change its own instance variable without affecting other objects")
    void test6(){
        example.setNumber2(getNumber());
        assertEquals(14, example.getNumber2());
        assertEquals(0, example2.getNumber2());
    }

    private int getNumber(){
        return 14;
    }

    @Test
    @DisplayName("an object can change its own instance variable")
    void test7(){
        example.setNumber2(getNumber());
        assertEquals(14, example.getNumber2());
        example2.setNumber2(15);
        assertEquals(15, example2.getNumber2());
    }

    @Test
    @DisplayName("non static method can set and get a static variable")
    void test8(){
        example.setNumber3(getNumber());
        assertEquals(14, example.getNumber3());
    }

    @Test
    @DisplayName("A static method can't ")
    void test9(){
        example.setNumber3(getNumber());
        assertEquals(14, example2.getNumber3());
    }

    @Test
    @DisplayName("A static variable can't access a non static variable without an object created")
    void test10(int number4){
        number4 = 9;
        Example.setNumber4(number4);
        assertEquals(9, Example.getNumber4());
    }
}