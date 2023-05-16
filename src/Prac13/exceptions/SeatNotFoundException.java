package Prac13.exceptions;

public class SeatNotFoundException extends Exception{
    public SeatNotFoundException() {
        this("seat not found in this theater!");
    }

    public SeatNotFoundException(String message) {
        super(message);
    }
}
