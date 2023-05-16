package Prac13.exceptions;

public class SeatIsNotReservedYetExecption extends Exception{
    public SeatIsNotReservedYetExecption() {
        this("seat is not reserved yet!");
    }

    public SeatIsNotReservedYetExecption(String message) {
        super(message);
    }
}
