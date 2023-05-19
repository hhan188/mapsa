package TheaterSeatReservation.Exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;

public class WrongSeatNumberException extends Exception {
    public WrongSeatNumberException(){super();}
    public WrongSeatNumberException(String errorMessage) {
        super(errorMessage);
    }
}