package TheaterSeatReservation;

import TheaterSeatReservation.Exceptions.SeatReservationException;
import TheaterSeatReservation.Exceptions.WrongSeatNumberException;

import java.io.FileNotFoundException;

import static TheaterSeatReservation.UserCommandLine.start;
import static TheaterSeatReservation.UserCommandLine.welcome;

public class Start {
    public static void main(String[] args) throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        welcome();
        start();

    }
}
