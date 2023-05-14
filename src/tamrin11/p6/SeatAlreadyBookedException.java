package tamrin11.p6;

public class SeatAlreadyBookedException extends Exception{

    public SeatAlreadyBookedException(String message) {
        super(message);
        System.out.println("SeatAlreadyBookedException Occurred");
    }
}
