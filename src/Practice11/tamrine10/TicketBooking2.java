package Practice11.tamrine10;

import Practice11.tamrine6.SeatAlreadyBookedException;
import Practice11.tamrine8.TicketBooking;

import java.util.ArrayList;

public class TicketBooking2 {
    private ArrayList<Integer> tickets;

    public TicketBooking2(ArrayList<Integer> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Integer> getTickets() {
        return tickets;
    }

    public void setSeats(ArrayList<Integer> tickets) {
        this.tickets = tickets;
    }

    public void bookingTicket2(int number) throws SeatAlreadyBookedException {
        try {
            if (!tickets.contains(number)) {
                tickets.add(number);
                System.out.println("this seat number is now booked successfully!");
            } else {
                throw new SeatAlreadyBookedException("this seat is already booked");

            }

        } catch (SeatAlreadyBookedException  e) {
            System.out.println(e.getMessage());
            //throw new ReservationNotMade(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception occured ");
        }
    }

    public void cancellingReservation(Integer number) throws ReservationNotMade {
        try {
            if (!tickets.contains(number)) {
                throw new ReservationNotMade("Reservation hasn't been made!");

            } else {
                tickets.remove(number);
            }

        } catch (ReservationNotMade e) {
            System.out.println(e.getMessage());
        }
    }
}


