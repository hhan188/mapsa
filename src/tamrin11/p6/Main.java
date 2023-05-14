package tamrin11.p6;

public class Main {
    public static void main(String[] args) {

        Flight th_shrz747_1 = new Flight("tehran_shiraz747", (short) 660);
        System.out.println("Flight reserving for " + th_shrz747_1.getFlightID());
        try {
            th_shrz747_1.seatBooking((short) 0);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
        try {
            th_shrz747_1.seatBooking((short) 1);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
        try {
            th_shrz747_1.seatBooking((short) 660);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
        try {
            th_shrz747_1.seatBooking((short) 661);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        th_shrz747_1.printReservedSeatsNumber();

        try {
            th_shrz747_1.seatBooking((short) 1);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

    }
}
