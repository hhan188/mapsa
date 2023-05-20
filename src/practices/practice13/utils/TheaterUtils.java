package practices.practice13.utils;

import practices.practice13.model.Seat;
import practices.practice13.model.Theater;

import java.util.ArrayList;
import java.util.List;

public class TheaterUtils extends Theater {

    /*------------------------------------
      Seats Number Generated Automatically
    --------------------------------------*/
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


     /*----------------------------------------------------------
      Create An Instance Of Theater thanks to createSeat() method
      -----------------------------------------------------------*/

    public Theater createTheater(String name, Integer raw, Integer column) {

        return new Theater(name, crateSeats(raw, column));
    }


     /*--------------------------------------------------------------------------
      Search Seat With Number Of Seat Just For Validate For Other Invoked Methods
      --------------------------------------------------------------------------*/

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


    /*--------------------------------------------------------------
     Validation Method The Number Of Seat Which Is Reserved Or Not
     --------------------------------------------------------------*/
    public Boolean checkSeat(Integer seatNumber) {
        if (seatNumber != null && searchSeat(seatNumber) != null) {
            return searchSeat(seatNumber).getAvailability();
        }
        return false;
    }

    /*--------------------------------------------------------------
      Reserve Or Cancel A Seat After Validate With checkSeat() Method
      ---------------------------------------------------------------*/
    public Seat reserveSeat(Integer seatNumber) {
        if (checkSeat(seatNumber)) {
            searchSeat(seatNumber).setAvailability(false);
            return searchSeat(seatNumber);
        }
        return null;
    }

    public Seat cancelSeat(Integer seatNumber) {
        if (!checkSeat(seatNumber) && seatNumber < getSeatList().size()) {
            searchSeat(seatNumber).setAvailability(true);
            return searchSeat(seatNumber);
        }
        return null;
    }

    /*--------------------------------------------------------------------
      Convert The The Above Methods To String To Get A Clear Message In CLI
     --------------------------------------------------------------------*/
    public String showReserveSeat(Integer seatNumber) {

        if (reserveSeat(seatNumber) != null) {
            return "Seat number '" + seatNumber + "' Successfully Reserved";
        } else return "Seat number '" + seatNumber + "' Is Already Reserved";


    }


    public String showCancelSeat(Integer seatNumber) {


        if (cancelSeat(seatNumber) != null) {
            return "Seat number '" + seatNumber + "' Reservation Successfully Canceled";
        }
        return "Seat number '" + seatNumber + "' Is Not Reserved";
    }

      /*------------------------------------------
        Show All Seat Whether IS Reserved Or Not
      -------------------------------------------*/

    public String availableSeat() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < getSeatList().size(); i++) {
            if (getSeatList().get(i).getAvailability()) {
                stringBuilder
                        .append("Seat number :'")
                        .append(getSeatList().get(i).getSeatNumber())
                        .append("' Is Available \n");

            } else stringBuilder
                    .append("Seat number :'")
                    .append(getSeatList().get(i).getSeatNumber())
                    .append("' Is UnAvailable \n");
        }
        return stringBuilder.toString();
    }
}
