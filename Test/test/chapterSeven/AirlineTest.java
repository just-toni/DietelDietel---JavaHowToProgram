package chapterSeven;

import chapterSeven.AirlineReservationSystem.Airline;
import chapterSeven.AirlineReservationSystem.Passenger;
import chapterSeven.AirlineReservationSystem.Plane;
import chapterSeven.AirlineReservationSystem.SeatClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {

    Airline airline;
    Plane plane;

    @BeforeEach
    void setUp(){
        airline = new Airline();
        plane = new Plane();
    }

    @AfterEach
    void tearDown(){
        airline = null;
        plane = null;
    }

    @Test
    void airline_CanBeCreated(){
        assertNotNull(airline);
    }

    @Test
    void airline_hasATenSeatPlaneCapacity(){
        assertEquals(10, airline.getNumberOfSeats());
    }

    @Test
    void airline_canAllowPassengerBookAFirstClassFlight(){
        Passenger passenger = new Passenger("","","");
        Plane.assignseat(passenger, SeatClass.FIRSTCLASS);
        assertTrue(plane.hasBooked(passenger));
    }

    @Test
    void airline_canAllowPassengerBookAnEconomyClassFlight(){
        Passenger passenger = new Passenger("","","");
        Plane.assignEconomySeat(passenger, SeatClass.ECONOMY);
        assertTrue(plane.hasBooked(passenger));
    }

    @Test
    v
}
