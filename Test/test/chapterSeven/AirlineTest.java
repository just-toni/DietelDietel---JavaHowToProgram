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
    void setUp() {
        airline = new Airline();
        plane = new Plane();
    }

    @AfterEach
    void tearDown() {
        airline = null;
        plane = null;
        Plane.resetSeatNumber();
    }

    @Test
    void airline_CanBeCreated() {
        assertNotNull(airline);
    }

    @Test
    void airline_hasATenSeatPlaneCapacity() {
        assertEquals(10, airline.getNumberOfSeats());
    }

    @Test
    void airline_canAllowPassengerBookAFirstClassFlight() {
        Passenger passenger = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger, SeatClass.FIRSTCLASS);
        assertEquals(1, passenger.getSeatNumber());
        assertTrue(Plane.hasBooked(passenger));
    }


    @Test
    void airline_canAllowPassengerBookAnEconomyClassFlight() {
        Passenger passenger = new Passenger("", "", "");
        Plane.assignEconomySeat(passenger, SeatClass.ECONOMY);
        assertEquals(1, passenger.getSeatNumber());
        assertTrue(Plane.hasBooked(passenger));
    }


    @Test
    void airline_cantAllowPassengerBookFirstClassBeyondTheCapacityOfFive() {
        Passenger passenger = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger, SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger));

        Passenger passenger1 = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger1, SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger1));

        Passenger passenger2 = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger2, SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger2));

        Passenger passenger3 = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger3, SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger3));

        Passenger  passenger4 = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger4, SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger4));

        Passenger passenger5 = new Passenger("", "", "");
        Plane.assignFirstClassSeat(passenger5, SeatClass.FIRSTCLASS);
        assertFalse(Plane.hasBooked(passenger5));
    }


    @Test
    void airline_cantAllowPassengerBookEconomyClassBeyondCapacityOfFive(){
        Passenger passenger = new Passenger("","","");
        Plane.assignEconomySeat(passenger,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger));
        Passenger passenger1 = new Passenger("","","");
        Plane.assignEconomySeat(passenger1,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger1));
        Passenger passenger2 = new Passenger("","","");
        Plane.assignEconomySeat(passenger2,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger2));
        Passenger passenger3 = new Passenger("","","");
        Plane.assignEconomySeat(passenger3,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger3));
       Passenger passenger4 = new Passenger("","","");
        Plane.assignEconomySeat(passenger4,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger4));
        Passenger passenger5 = new Passenger("","","");
        Plane.assignEconomySeat(passenger5,SeatClass.ECONOMY);
        assertEquals(false, Plane.hasBooked(passenger5));
    }

    @Test
    void airline_canObtainTotalNumberOfOccupiedSeatsPerEconomyClass(){
        Passenger passenger = new Passenger("","","");
        Plane.assignEconomySeat(passenger,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger));
        Passenger passenger1 = new Passenger("","","");
        Plane.assignEconomySeat(passenger1,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger1));
        Passenger passenger2 = new Passenger("","","");
        Plane.assignEconomySeat(passenger2,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger2));
        Passenger passenger3 = new Passenger("","","");
        Plane.assignEconomySeat(passenger3,SeatClass.ECONOMY);
        assertTrue(Plane.hasBooked(passenger3));
        assertEquals(4, plane.getBookedSeats());
    }

    @Test
    void airline_canObtainTotalNumberOfOccupiedSeatsPerFirstClass(){
        Passenger passenger = new Passenger("","","");
        Plane.assignFirstClassSeat(passenger,SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger));
        Passenger passenger1 = new Passenger("","","");
        Plane.assignFirstClassSeat(passenger1,SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger1));
        Passenger passenger2 = new Passenger("","","");
        Plane.assignFirstClassSeat(passenger2,SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger2));
        assertEquals(3, plane.getBookedSeats());
    }

    @Test
    void airline_canPrintTicket(){
        Passenger passenger = new Passenger("","","");
        Plane.assignFirstClassSeat(passenger,SeatClass.FIRSTCLASS);
        assertTrue(Plane.hasBooked(passenger));
        assertEquals(1, plane.getBookedSeats());
        System.out.println(airline.generateTicket(passenger));
        assertEquals("Passenger{\n" +
                "firstName ='\n" +
                ", lastName ='\n" +
                ", emailAddress ='\n" +
                ", seatNumber =1\n" +
                ", seatClass =FIRSTCLASS}",airline.generateTicket(passenger));
    }

    @Test
    void airline_canPrintTicketWhenPassengerHasBookedSeat(){
        Passenger passenger = new Passenger("","","");
        System.out.println(airline.generateTicket(passenger));
        assertEquals("You haven't booked a flight!",airline.generateTicket(passenger));
    }
}
