package practice13Test;

public class SeatNotFoundException extends Exception{
    public SeatNotFoundException() {
        this("Seat Not Found!");
    }

    public SeatNotFoundException(String message) {
        super(message);
    }
}
