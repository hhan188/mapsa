package Prac11.P11;

public class Main {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        Seat seat1 = new Seat(1);
        Seat seat2 = new Seat(2);
        Seat seat3 = new Seat(3);
        ticketBooking.addSeat(seat1);
        ticketBooking.addSeat(seat2);
        ticketBooking.addSeat(seat3);

        try {
            ticketBooking.bookSeat(1);
            ticketBooking.bookSeat(2);
        } catch (SeatAlreadyBookedException e) {
            System.err.println(e.getMessage());
        }
        try {
            ticketBooking.bookSeat(1);
            ticketBooking.cancelSeat(3);
        } catch (SeatAlreadyBookedException | SeatIsNotBookedYetException e) {
            System.err.println(e.getMessage());
        }
    }
}
