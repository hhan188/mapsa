package practice13Test;

public class SeatAlreadyReservedException extends Exception{
    public SeatAlreadyReservedException() {
        this("This Seat is Already Reserved!");
    }

    public SeatAlreadyReservedException(String message) {
        super(message);
    }
}
