package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testThatDateCanBeInNumbers(){
        Date date = new Date(12,21,2014);
        assertEquals("12/21/2014", date.toString());
    }

    @Test
    void testThatDateCanJustBeDayAndYear(){
        Date date = new Date(234, 2019);
        assertEquals("234 2019", date.getYearDate());
    }

    @Test
    void testThatDateCanBeEnteredWithMonthFirst(){
        Date date = new Date("JANUARY", 23, 1998);
        assertEquals("JANUARY 23, 1998", date.getDate());
    }

    @Test
    void testThatInvalidMonthCantBeUsed() {
        try {
            Date date = new Date(32, 21, 2014);
        } catch (MonthException exception) {
            System.out.println("Invalid month");
        }
        assertThrows(MonthException.class, () -> {Date date = new Date(32, 21, 2014);});
    }

    @Test
    void testThatInvalidDayCantBeUsed() {
        try {
            Date date = new Date(02, 87, 2014);
        } catch (DayException exception) {
            System.out.println("Invalid day");
        }
        assertThrows(DayException.class, () -> {Date date = new Date(02, 87, 2014);});
    }

    @Test
    void testThatInvalidYearCantBeUsed() {
        try {
            Date date = new Date(02, 21, 190);
        } catch (YearException exception) {
            System.out.println("Invalid year");
        }
        assertThrows(YearException.class, () -> {Date date = new Date(02, 21, 190);});
    }

}