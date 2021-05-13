package chapterNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    HourlyEmployee hourlyEmployee;

    @BeforeEach
    void setUp() {
        hourlyEmployee = new HourlyEmployee("Jack", "Scollof", "WQ54", 88, 96.9);
    }

    @AfterEach
    void tearDown() {
        hourlyEmployee = null;
    }

    @Test
    void testThatHourlyEmployeeInheritsFromEmployee(){
        hourlyEmployee.setWages(100);
        hourlyEmployee.setHours(108);
        assertEquals("""
                First name: Jack
                Last name: Scollof
                Social Security Number: WQ54
                Hours: 108.0
                Wages: 100.0""", hourlyEmployee.toString());
    }

    @Test
    void testThatHourlyEmployeeHasEarnings(){
        assertEquals(8527.2, hourlyEmployee.calculateEarnings());
    }
}