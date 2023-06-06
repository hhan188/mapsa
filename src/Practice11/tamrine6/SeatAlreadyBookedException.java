package Practice11.tamrine6;

public class SeatAlreadyBookedException extends Exception{
    public SeatAlreadyBookedException() {
       // System.out.println("ERROR!this seat is already booked!");
    }
    public SeatAlreadyBookedException(Throwable cause) {
        super(cause);
    }
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
