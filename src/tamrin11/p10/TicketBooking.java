package tamrin11.p10;

public class TicketBooking {

    private Flight flight;

    private boolean[] seats;

    public TicketBooking(Flight flight) {
        this.flight = flight;
        this.seats = new boolean[flight.getTotalSeatNumber() + 1];
    }

    public Flight getFlight() {
        return flight;
    }

    public void seatBooking(short seatNumber) throws BookingException {
        //check out of range
        if (seatNumber <= 0 || seatNumber >= seats.length) {
            System.out.println("Seat number " + seatNumber + " is out of range!!!");
            return;
        }
        //check already booked
        if (this.seats[seatNumber]) {
            SeatAlreadyBookedException e = new SeatAlreadyBookedException
                    ("This seat number " + seatNumber + " was reserved\n");
            BookingException be = new BookingException(e);
            throw be;
        }
        //normal
        this.seats[seatNumber] = true;
        System.out.println("Reservation successful for seat number " + seatNumber);
    }

    public void cancelBooking(short seatNumber) throws BookingException {
        //check out of range
        if (seatNumber <= 0 || seatNumber >= seats.length) {
            System.out.println("Seat number " + seatNumber + " is out of range!!!");
            return;
        }
        //check not booked yet
        if (!this.seats[seatNumber]) {
            SeatNotBookedException e = new SeatNotBookedException
                    ("This seat number " + seatNumber + " is not already reserved\n");
            BookingException be = new BookingException(e);
            throw be;
        }
        //normal
        this.seats[seatNumber] = false;
        System.out.println("Cancellation successful for seat number " + seatNumber);

    }

    public void printReservedSeatsNumber() {
        System.out.println("Reserved Seats for " + flight.getFlightID());
        for (int i = 1; i < seats.length; i++) {
            if (seats[i])
                System.out.print("S" + i + " ");
        }
        System.out.println("\n - - - - - - - - - - - - - - - - - - -\n");
    }


}
