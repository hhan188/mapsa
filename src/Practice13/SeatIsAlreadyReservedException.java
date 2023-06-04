package Practice13;

public class SeatIsAlreadyReservedException extends ServiceException {
    public SeatIsAlreadyReservedException() {
        printMessage("This Seat is Already Reserved!");
    }


}
