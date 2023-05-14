package tamrin11.p10;

public class SeatAlreadyBookedException extends BookingException {

    public SeatAlreadyBookedException(String message) {
        super(message);
        System.out.println("\nSeatAlreadyBookedException Occurred");
    }
}
