package Prac11.P11;

public class SeatIsNotBookedYetException extends Exception{
    public SeatIsNotBookedYetException() {
        this("seat is not booked yet");
    }

    public SeatIsNotBookedYetException(String message) {
        super(message);
    }
}
