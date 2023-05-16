package Prac13.exceptions;

public class SeatAlreadyReservedException extends Exception {
    public SeatAlreadyReservedException() {
        this("seat is already reserved!");
    }

    public SeatAlreadyReservedException(String message) {
        super(message);
    }
}
