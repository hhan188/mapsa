package practice13Test;

public class SeatNotReservedYetException extends Exception{
    public SeatNotReservedYetException() {
        this("This Seat is Not Reserved Yet!");
    }

    public SeatNotReservedYetException(String message) {
        super(message);
    }
}
