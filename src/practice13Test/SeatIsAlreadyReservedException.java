package practice13Test;

public class SeatIsAlreadyReservedException extends Exception{
    public SeatIsAlreadyReservedException() {
        this("This Seat is Already Reserved!");
    }

    public SeatIsAlreadyReservedException(String message) {
        super(message);
    }
}
