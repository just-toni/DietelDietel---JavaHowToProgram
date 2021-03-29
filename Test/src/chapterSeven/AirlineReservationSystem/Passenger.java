package chapterSeven.AirlineReservationSystem;

public class Passenger {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private int seatNumber;
    private SeatClass seatClass;

    public Passenger(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public void assignSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public void assignSeatClass(SeatClass seatClass){
        this.seatClass = seatClass;
    }
    public SeatClass getSeatClass(){
        return  seatClass;
    }

    }
