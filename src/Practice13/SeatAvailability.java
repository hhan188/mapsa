package Practice13;

import Practice13.Exceptions.SeatIsNotFindException;

import java.util.List;

public class SeatAvailability extends Seat{
    public SeatAvailability(int seatNumber, int row, boolean availabilityStatus) {
        super(seatNumber, row, availabilityStatus);
    }

    public SeatAvailability() {
    }

    static List<Seat> seats = new Theater().getSeats();


    public void availability(int seatNumber) throws SeatIsNotFindException {

        for (Seat item:seats) {
            if (item.getSeatNumber()==seatNumber){
                if (item.isAvailabilityStatus()){
                    System.out.println(isAvailabilityStatus());

                }else throw new SeatIsNotFindException();
            }

        }
    }
}
