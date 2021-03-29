package chapterSeven.AirlineReservationSystem;

public class Plane {

    private static boolean[][] seats = new boolean[2][5];
    private static Passenger[][] passengers = new Passenger[2][5];
    private static int firstClassSeatNumber;
    private static int economyClassSeatNumber = 0;

    public static void assignseat(Passenger passenger, SeatClass seatClass) {
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
            for (int i = 0; i < passengers.length; i++) {
                if(passengers[1][i] == null){
                    passengers[1][i] = passenger;
                    seats[1][i] = true;
                    passenger.assignSeatNumber(economyClassSeatNumber++);
                    passenger.assignSeatClass(seatClass);
                }
            }
        }
    }

    public int getSeat() {
        return seats[0].length + seats[1].length;
    }
    public boolean hasBooked(Passenger passenger){
                if(passenger.getSeatClass() == SeatClass.FIRSTCLASS)
                    return seats[0][passenger.getSeatNumber() - 1];
                else
                    return seats[1][passenger.getSeatNumber()];

    }
}
