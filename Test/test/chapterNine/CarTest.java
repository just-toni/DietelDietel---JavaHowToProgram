package chapterNine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void inheritanceTest(){
        Car car = new Car();
        car.parentDrive();
        car.setNumberOfTyres(5);
        System.out.println(car.getNumberOfTyres());
    }


}