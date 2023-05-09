package Practice11.six;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    HashMap<Integer,String> seatCancelingBooking=new HashMap<>();


    public void seatBooking(int ChairNumber,String name)throws SeatAlreadyBookedException{
        seatCancelingBooking.put(ChairNumber,name);

    }
    public void deleteBooking(int ChairNumber)throws  SeatAlreadyBookedException{
        seatCancelingBooking.remove(ChairNumber);

    }

    public Flight() {
        this.seatCancelingBooking = seatCancelingBooking;
    }

    public HashMap<Integer, String> getSeatCancelingBooking() {
        return seatCancelingBooking;
    }

    public void setSeatCancelingBooking(HashMap<Integer, String> seatCancelingBooking) {
        this.seatCancelingBooking = seatCancelingBooking;
    }

    public Flight(HashMap<Integer, String> seatCancelingBooking) {
        this.seatCancelingBooking = seatCancelingBooking;
    }
}
