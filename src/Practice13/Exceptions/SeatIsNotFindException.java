package Practice13.Exceptions;

public class SeatIsNotFindException extends Exception {
    public SeatIsNotFindException() {
        this("Seat iS Not Found");
    }

    public SeatIsNotFindException(String message) {
        super(message);
    }
}
