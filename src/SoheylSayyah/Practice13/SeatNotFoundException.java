package SoheylSayyah.Practice13;

public class SeatNotFoundException extends Exception{
    public SeatNotFoundException() {
        this("Seat Not Found!");
    }

    public SeatNotFoundException(String message) {
        super(message);
    }
}
