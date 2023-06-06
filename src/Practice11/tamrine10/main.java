package Practice11.tamrine10;

import Practice11.tamrine6.SeatAlreadyBookedException;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws SeatAlreadyBookedException, ReservationNotMade {
        ArrayList<Integer> sts=new ArrayList<>(100);
        TicketBooking2 tick=new TicketBooking2(sts);

        tick.bookingTicket2(99);
        System.out.println("---------------");
        tick.bookingTicket2(99);
        System.out.println("------------");

//        tick.bookingTicket2(3);
//        System.out.println("------------");
        tick.cancellingReservation(3);
//        System.out.println(sts.contains(3));

    }
}
