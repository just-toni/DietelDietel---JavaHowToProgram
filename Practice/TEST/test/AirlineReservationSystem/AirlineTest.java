package AirlineReservationSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {
    Airline newAirline;
    Plane aeroplane;

    @BeforeEach
    void setUp() {
        newAirline = new Airline("Qatar Airline", aeroplane);
        aeroplane = new Plane("Qatar 210", "2134ARF");
    }

    @AfterEach
    void tearDown() {
        newAirline = null;
        aeroplane = null;
    }

    @Test
    void testThatAirlineCanBeCreatedWithNotNullMethod(){
        assertNotNull(newAirline);
    }

    @Test
    void testThatAirlineCanBeCreatedWithToStringMethod(){
        assertEquals("Airline name: Qatar Airline\n" +
                "Number of aeroplanes: " + newAirline.getNumberOfAeroplanes() + "\n" +
                "Names of aeroplanes: " + newAirline.getNamesOfAeroplanes(),newAirline.toString());
    }


}