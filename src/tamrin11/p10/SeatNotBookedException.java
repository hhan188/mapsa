package tamrin11.p10;

public class SeatNotBookedException extends BookingException {
    public SeatNotBookedException(String message) {
        super(message);
        System.out.println("\nSeatNotBookedException Occurred");
    }
}
