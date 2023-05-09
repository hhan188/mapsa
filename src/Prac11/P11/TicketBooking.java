package Prac11.P11;

import java.util.HashMap;

public class TicketBooking {
    private HashMap<Integer, Seat> seats;

    public TicketBooking() {
        seats = new HashMap<>();
    }

    public HashMap<Integer, Seat> getSeats() {
        return seats;
    }

    public void bookSeat(int seatNum) throws SeatAlreadyBookedException {
        Seat seat = seats.get(seatNum);
        if (seat.isBooked())
            throw new SeatAlreadyBookedException();
        else
            seat.toggleBooked();
    }

    public void cancelSeat(int seatNum) throws SeatIsNotBookedYetException{
        Seat seat = seats.get(seatNum);
        if (seat.isBooked())
            seat.toggleBooked();
        else
            throw new SeatIsNotBookedYetException();
    }

    public void addSeat(Seat seat) {
        seats.put(seat.getNumber(), seat);
    }
}
