package Practice13;

public class SeatNotFoundException extends ServiceException{
    public SeatNotFoundException(String message) {
        printMessage(message);
    }
}
