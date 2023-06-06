package Practice11.tamrine6;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws SeatAlreadyBookedException {
        ArrayList<Integer> sts=new ArrayList<>(100);
        Flight flight=new Flight(sts);

        flight.bookingSeat(4);
        System.out.println("---------------");
        flight.bookingSeat(4);
        System.out.println("------------");

        flight.bookingSeat(3);
        System.out.println("------------");
        flight.cancellingBooking(3);
        System.out.println(sts.contains(3));


    }
}
