package Tamrin11;

import java.util.List;

public class TicketBooking {
    //Write a program that simulates a ticket booking system.
    // Create a TicketBooking class with methods for reserving a ticket and
    // canceling a reservation, and use a multi-catch
    // block to handle any exceptions that may be thrown if
    // a user attempts to book a seat that has already been booked or
    // cancels a reservation that has not been made.
    public boolean reserving(int num, List<Integer> reserve) throws SeatAlreadyBookedEXception {
        if(num>100||num<0){
            //throw new
        } else if (reserve.contains(num)) {
            throw new SeatAlreadyBookedEXception("seat");
        }
        reserve.add(num);
        return true;
    }
}
