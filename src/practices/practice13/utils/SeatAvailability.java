package practices.practice13.utils;

import practices.practice13.model.Seat;
import practices.practice13.model.Theater;

import java.util.ArrayList;
import java.util.List;

public class SeatAvailability extends Theater {
//    Seat Availability:
//    Create a class that checks the availability of a specific seat and displays its current status.

    //    Develop a Theater class that manages the collection of seats.
//    It should support operations like displaying the seating arrangement, reserving a seat,
//    canceling a reservation, and checking seat availability.
//    Theater class should have a contractor that gets theater name, number of rows and column , … , and fills
//    the seats collection base on this row and column.


    public List<Seat> crateSeats(Integer raw, Integer column) {
        int count = 1;
        List<Seat> list = new ArrayList<>();

        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= column; j++) {
                Seat seat = new Seat(count++, i, j, true);
                list.add(seat);
            }
        }
        setSeatList(list);
        return getSeatList();
    }

    public Theater createTheater(String name, Integer raw, Integer column) {
        return new Theater(name, crateSeats(raw, column));
    }

    public Seat searchSeat(Integer seatNumber) {
        if (seatNumber <= getSeatList().size()) {
            for (int i = 0; i < getSeatList().size(); i++) {
                if (seatNumber.equals(getSeatList().get(i).getSeatNumber())) {
                    return getSeatList().get(i);
                }
            }
        }
        return null;
    }

    public Boolean checkSeat(Integer seatNumber) {
        if (seatNumber != null && searchSeat(seatNumber) != null) {
            return searchSeat(seatNumber).getAvailability();
        }
        return false;
    }

    public Seat reserveSeat(Integer seatNumber) {
        if (checkSeat(seatNumber)) {
            searchSeat(seatNumber).setAvailability(false);
            return searchSeat(seatNumber);
        }
        return null;
    }

    public Seat cancleSeat(Integer seatNumber) {
        if (!checkSeat(seatNumber)) {
            searchSeat(seatNumber).setAvailability(true);
            return searchSeat(seatNumber);
        }
        return null;
    }


    public static void main(String[] args) {
        SeatAvailability seatAvailability = new SeatAvailability();
        Theater theater = seatAvailability.createTheater("ali", 3, 4);
        System.out.println(theater);
        System.out.println("********************");
        System.out.println(seatAvailability.reserveSeat(10));
        System.out.println(seatAvailability.reserveSeat(11));
        System.out.println(seatAvailability.reserveSeat(12));
        System.out.println(seatAvailability.reserveSeat(15));
        System.out.println(seatAvailability.cancleSeat(10));
        System.out.println(seatAvailability.cancleSeat(17));
        System.out.println("*********************************");
        System.out.println(theater);
    }
}
