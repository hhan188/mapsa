package Practice13.Exceptions;

public class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException() {
        this("Seat Is Already Reserved");
    }
    public SeatAlreadyBookedException(String message){
        super(message);
    }
}
