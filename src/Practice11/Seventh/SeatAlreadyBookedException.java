package Practice11.Seventh;

public class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException() {
    }

    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
