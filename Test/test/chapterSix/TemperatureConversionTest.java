package chapterSix;

import chapterSix.TemperatureConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionTest {

    @Test
    void testThatCelsiusConvertsToFahrenheit(){
        double result = 0;
        result = TemperatureConversion.celsius(32);
        assertEquals(0,result);
    }

    @Test
    void testThatFahrenheitConvertsToCelsius(){
        double result = 0;
        result = TemperatureConversion.fahrenheit(100);
        assertEquals(237.6,result);
    }

}