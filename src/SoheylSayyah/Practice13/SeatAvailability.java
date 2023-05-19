package SoheylSayyah.Practice13;
import java.util.Collection;
public class SeatAvailability extends Seat{
    public SeatAvailability(int seatNumber, int rowNumber, boolean availability) {
        super(seatNumber, rowNumber, availability);
    }
    static Collection<Seat> seats = new Theater().getSeats();
    public void checkAvailability(int seatNumber) throws SeatNotFoundException {
        for (Seat item : seats){
            if (item.getSeatNumber() == seatNumber){
                System.out.println("Seat is " + (item.isAvailability() ? "Available" : "Reserved"));
            }else {
                throw new SeatNotFoundException();
            }
        }
    }
}
