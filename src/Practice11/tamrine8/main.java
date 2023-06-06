package Practice11.tamrine8;

import Practice11.tamrine6.Flight;
import Practice11.tamrine6.SeatAlreadyBookedException;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws SeatAlreadyBookedException {
        ArrayList<Integer> sts=new ArrayList<>(100);
        TicketBooking tick=new TicketBooking(sts);

        tick.bookingTicket(99);
        System.out.println("---------------");
        tick.bookingTicket(99);
        System.out.println("------------");

        tick.bookingTicket(3);
        System.out.println("------------");
        tick.cancellingReservation(3);
        System.out.println(sts.contains(3));
    }
}
