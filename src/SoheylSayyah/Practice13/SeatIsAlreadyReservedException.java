package SoheylSayyah.Practice13;

public class SeatIsAlreadyReservedException extends Exception{
    public SeatIsAlreadyReservedException() {
        this("This Seat is Already Reserved!");
    }

    public SeatIsAlreadyReservedException(String message) {
        super(message);
    }
}
