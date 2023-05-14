package tamrin11.p6;

public class Flight {

    private String flightID;

    private short totalSeatNumber;
    private boolean[] seats;

    public Flight(String flightID, short totalSeatNumber) {
        this.flightID = flightID;
        this.seats = new boolean[totalSeatNumber + 1];
    }

    public String getFlightID() {
        return flightID;
    }

    public void seatBooking(short seatNumber) throws SeatAlreadyBookedException {
        if (seatNumber <= 0 || seatNumber >= seats.length){
            System.out.println("Seat number " + seatNumber +" is out of range!!!");
            return;
        }
        if (this.seats[seatNumber]){
            throw new SeatAlreadyBookedException("This seat number " + seatNumber + " was reserved");
        }
        this.seats[seatNumber] = true;
    }

    public void cancelBooking(short seatNumber){
        if (seatNumber <= 0 || seatNumber >= seats.length){
            System.out.println("Seat number " + seatNumber +" is out of range!!!");
            return;
        }
        if (!this.seats[seatNumber]){
            System.out.println("The seat number " + seatNumber + " is not reserved");
            return;
        }
        this.seats[seatNumber] = false;
    }

    public void printReservedSeatsNumber(){
        System.out.println("\nReserved Seats for " + flightID);
        for (int i = 1; i < seats.length ; i++) {
            if (seats[i])
                System.out.print("S" + i + " ");
        }
        System.out.println("\n - - - - - - - - - - - - - - - - - - -\n");
    }


}
