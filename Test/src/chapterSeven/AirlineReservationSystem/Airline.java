package chapterSeven.AirlineReservationSystem;

public class Airline {

    Plane plane = new Plane();

    public int getNumberOfSeats() {
        return plane.getSeat();
    }


    public String generateTicket(Passenger passenger) {
        if(Plane.hasBooked(passenger))
        return passenger.toString();
        else
            return "You haven't booked a flight!";
    }
}
