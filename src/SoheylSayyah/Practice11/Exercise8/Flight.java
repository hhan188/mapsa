package SoheylSayyah.Practice11.Exercise8;

public class Flight {
    private boolean isBooked;
    public Flight() {
    }
    public Flight(boolean isBooked) {
        this.isBooked = isBooked;
    }
    public void booking() throws SeatAlreadyBookedException {
        if (isBooked){
            throw new SeatAlreadyBookedException("Seat is Already Booked");
        }
    }
    public boolean canceling(){
        return isBooked = false;
    }
}
