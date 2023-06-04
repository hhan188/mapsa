package Practice13;
import java.util.List;

public class SeatAvailability extends Seat {
    //Seat Availability:
    // Create a class that checks the availability of a specific seat and displays its
    // current status.

    public boolean checkAvailability(int seatNumber, List<Seat> seats) throws SeatNotFoundException {
        for (Seat item : seats){
            if (item.getSeatNumber() == seatNumber){
                System.out.println("Seat is " + (item.isAvailability() ? "Available" : "Reserved"));
                return item.isAvailability();
            }
        }
        System.out.println("seat Not found");
        return false;
    }}
