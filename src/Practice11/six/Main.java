package Practice11.six;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> seatCancelingBooking=new HashMap<>();

        Flight fl=new Flight(seatCancelingBooking);
        try {
            fl.seatBooking(1,"ali");
        } catch (SeatAlreadyBookedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(seatCancelingBooking);

        try {
            fl.deleteBooking(1);
        } catch (SeatAlreadyBookedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(seatCancelingBooking);


    }
}
