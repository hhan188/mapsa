package Practice11.six;

public class SeatAlreadyBookedException extends Exception{
    public SeatAlreadyBookedException() {
        super();
    }

    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
