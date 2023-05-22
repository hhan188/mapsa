package tamrin13;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private String name;
    private int theaterRow;
    private int theaterColumn;

    //Composition Relationship
    private List<Seat> seatList;


    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTheaterRow() {
        return theaterRow;
    }

    public void setTheaterRow(int theaterRow) {
        this.theaterRow = theaterRow;
    }

    public int getTheaterColumn() {
        return theaterColumn;
    }

    public void setTheaterColumn(int theaterColumn) {
        this.theaterColumn = theaterColumn;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public int getTheaterSize(){
        return this.seatList.size();
    }


    //Initialize Theater Seats
    public List<Seat> theaterSeatsInitializationByRC() {

        int seatsCount = theaterRow * theaterColumn;
        //Making index and seatNumber consistent
        List<Seat> theaterSeatsList = new ArrayList<>(seatsCount + 1);
        theaterSeatsList.add(0, null);

        int seatNumber = 1;
        for (int seatRow = 1; seatRow <= theaterRow; seatRow++) {
            for (int seatCol = 1; seatCol <= theaterColumn; seatCol++) {
                theaterSeatsList.add(seatNumber, new Seat(seatNumber, seatRow, seatCol, true));
                seatNumber++;
            }
        }
        return theaterSeatsList;
    }


    //Display Theater Seats Arrangement
    public void displaySeatsArrangement() {

        int nextRow = 2;

        System.out.println(Menu.ANSI_BLUE + "\n=== Display Theater Seats Arrangement ===");
        System.out.print(Menu.ANSI_CYAN);
        for (int seat = 1; seat < this.seatList.size(); seat++) {
            if (nextRow == seatList.get(seat).getRow()) {
                System.out.println();
                nextRow++;
            }
            if (seatList.get(seat).getNumber() > 9)
                System.out.print("S#" + seatList.get(seat).getNumber() + "\t");
            else
                System.out.print("S#0" + seatList.get(seat).getNumber() + "\t");
        }
        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print(Menu.ANSI_RESET);
    }


    //Reserving a seat
    public boolean reserveSeat(int seatNumber) {

        if (!seatList.get(seatNumber).isAvailability()) {
            System.out.println(Menu.ANSI_RED + "==> This seat is reserved earlier" + Menu.ANSI_RESET);
            return false;
        }
        //Reserving the seat
        seatList.get(seatNumber).setAvailability(false);
        return true;
    }


    //Canceling a seat
    public boolean cancelSeat(int seatNumber) {

        if (seatList.get(seatNumber).isAvailability()) {
            System.out.println(Menu.ANSI_RED + "==> This seat is not reserved earlier" + Menu.ANSI_RESET);
            return false;
        }
        //Canceling the seat
        seatList.get(seatNumber).setAvailability(true);
        return true;
    }


    //Check seat availability
    public boolean checkSeatStatus(int seatNumber) {

        return seatList.get(seatNumber).isAvailability();
    }

}
