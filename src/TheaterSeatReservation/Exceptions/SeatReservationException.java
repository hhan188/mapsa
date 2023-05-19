package TheaterSeatReservation.Exceptions;

import TheaterSeatReservation.Seat;

import java.io.PrintStream;

public class SeatReservationException extends Exception {

    public SeatReservationException(){super();}
    public SeatReservationException(String errorMessage){
        super(errorMessage);
    }
}
