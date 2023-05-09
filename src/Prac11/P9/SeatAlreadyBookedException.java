package Prac11.P9;

public class SeatAlreadyBookedException extends Exception{
    public SeatAlreadyBookedException() {
        this("seat is already booked");
    }

    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
