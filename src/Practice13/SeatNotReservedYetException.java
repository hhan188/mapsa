package Practice13;

public class SeatNotReservedYetException extends ServiceException {
    public SeatNotReservedYetException() {
        printMessage("This Seat is Not Reserved Yet!");
    }
}
