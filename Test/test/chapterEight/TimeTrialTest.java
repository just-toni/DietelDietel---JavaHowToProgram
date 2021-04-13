package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeTrialTest {
    TimeTrial trial;

    @BeforeEach
    void setUp() {
        trial = new TimeTrial();
    }

    @AfterEach
    void tearDown() {
        trial = null;
    }

    @Test
    void testThatHourCanBeSet(){
        int hour = 10;
        trial.setHour(hour);
        assertEquals(10, trial.getHour());
    }

    @Test
    void testThatMinutesCanBeSet(){
        int minute = 45;
        trial.setMinute(minute);
        assertEquals(45, trial.getMinute());
    }

    @Test
    void testThatSecondsCanBeSet(){
        int second = 34;
        trial.setSeconds(second);
        assertEquals(34, trial.getSeconds());
    }

    @Test
    void testThatWrongHourEnteredCanShowErrorMessage(){
        int hour = 45;
        assertThrows(IllegalArgumentException.class, ()-> trial.setHour(hour));
    }

    @Test
    void testThatWrongMinuteEnteredCanShowErrorMessage(){
        int minute = 145;
        assertThrows(IllegalArgumentException.class, ()-> trial.setMinute(minute));
    }

    @Test
    void testThatWrongSecondEnteredCanShowErrorMessage(){
        int second = 145;
        assertThrows(IllegalArgumentException.class, ()-> trial.setSeconds(second));
    }
    
    @Test
    void testToDisplayTimeInUniversalTimeFormat(){
        trial.setHour(3);
        trial.setMinute(45);
        trial.setSeconds(23);
        assertEquals("03:45:23", trial.toUniversalTimeFormat());
    }

    @Test
    void testToDisplayTimeInStandardTimeFormat(){
        trial.setHour(6);
        trial.setMinute(15);
        trial.setSeconds(43);
        assertEquals("06:15:43 AM", trial.toStandardTimeFormat());
    }
}