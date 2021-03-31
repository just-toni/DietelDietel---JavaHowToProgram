package chapterSeven.AirlineReservationSystem;

import java.util.Arrays;

public class Plane {

    private static boolean[][] seats = new boolean[2][5];
    private static Passenger[][] passengers = new Passenger[2][5];
    private static int firstClassSeatNumber ;
    private static int economyClassSeatNumber;

    public static void assignFirstClassSeat(Passenger passenger, SeatClass seatClass) {
        if(seatClass ==  SeatClass.FIRSTCLASS)
            for (int i = 0; i < passengers[0].length; i++) {
                if(passengers[0][i] == null) {
                    passengers[0][i] = passenger;
                    seats[0][i] = true;
                    passenger.assignSeatNumber(++firstClassSeatNumber);
                    passenger.assignSeatClass(seatClass);
                    break;
                }
            }
    }

    public static void assignEconomySeat(Passenger passenger, SeatClass seatClass) {
        if(seatClass == SeatClass.ECONOMY){
            for (int i = 0; i < passengers[1].length; i++) {
                if(passengers[1][i] == null){
                    passengers[1][i] = passenger;
                    seats[1][i] = true;
                    passenger.assignSeatNumber(++economyClassSeatNumber);
                    passenger.assignSeatClass(seatClass);
                    break;
                }
            }
        }
    }

    public int getSeat() {
        return seats[0].length + seats[1].length;
    }

    public static boolean hasBooked(Passenger passenger) {
        boolean hasBooked = false;
        if (passenger.getSeatClass() == SeatClass.FIRSTCLASS) {
            for (int i = 0; i < passengers[0].length; i++) {
                if (passengers[0][i].equals(passenger)) {
                    hasBooked = seats[0][passenger.getSeatNumber() - 1];
                    break;
                }
            }
        }

        else if (passenger.getSeatClass() == SeatClass.ECONOMY)
            for (int i = 0; i < passengers[1].length; i++) {
                if (passengers[1][i].equals(passenger)) {
                    hasBooked = seats[1][passenger.getSeatNumber() - 1];
                    break;
                }


            }
            return hasBooked;
    }

    public int getBookedSeats() {
        if(economyClassSeatNumber > 0){
            return economyClassSeatNumber;
        }
        else return firstClassSeatNumber;
    }
    public static void resetSeatNumber(){
        for (Passenger[] passenger : passengers) {
            Arrays.fill(passenger, null);
        }

//        Arrays.fill(seats, false);
        firstClassSeatNumber = 0;
        economyClassSeatNumber = 0;
    }
}
