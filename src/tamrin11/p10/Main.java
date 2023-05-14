package tamrin11.p10;

public class Main {
    public static void main(String[] args) {

        Flight th_shrz747_1 = new Flight("tehran_shiraz747", (short) 660);

        TicketBooking tb = new TicketBooking(th_shrz747_1);
        System.out.println("Flight reserving for " + tb.getFlight().getFlightID());

        //out of range
        try {
            tb.seatBooking((short) 0);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }
        //test boundary
        try {
            tb.seatBooking((short) 1);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }
        //test boundary
        try {
            tb.seatBooking((short) 660);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }
        //out of range
        try {
            tb.seatBooking((short) 661);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }

        //Print status
        tb.printReservedSeatsNumber();

        //test already booked scenario
        try {
            tb.seatBooking((short) 1);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }
        //test cancel scenario
        try {
            tb.cancelBooking((short) 1);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }
        //test not booked yet
        try {
            tb.cancelBooking((short) 2);
        } catch (BookingException e) {
            System.out.println(e.getMessage());
        }

        //Print status
        tb.printReservedSeatsNumber();

    }
}
