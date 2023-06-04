package Practice13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Practice13.importExportFile.importCSV;

public class Theater extends SeatAvailability {
    //Theater Class: Develop a Theater class that manages the collection of seats.
    // It should support operations
    //like displaying the seating arrangement, reserving a seat, canceling a reservation,
    // and checking seat availability.
    // Theater class should have a contractor that gets theater name,
    // number of rows and column ,
    //… , and fills the seats collection base on this row and column.
    private String theaterName;
    private int numberOfRows;
    private int numberOfColumns;
    final List<Seat> seats = new ArrayList<>();
    final String file = "/home/ershadbakhsh/Desktop/TheaterSeats.csv";

    public Theater(String theaterName, int numberOfRows, int numberOfColumns) {
        super();
        this.theaterName = theaterName;
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        createSeats();
    }

    private void createSeats() {
        int seatNumber = 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfColumns; j++) {
                seats.add(new Seat(seatNumber, i, true));
                seatNumber++;
            }
        }
    }

    public void reserving(int seatNumber) throws SeatIsAlreadyReservedException, SeatNotFoundException {
        if (checkAvailability(seatNumber, this.seats)) {
            for (Seat item : seats) {
                if (item.getSeatNumber() == seatNumber) {
                    item.setAvailability(false);
                }
            }
            System.out.println("seatNumber" + seatNumber + "reserved successfully");
        } else throw new SeatIsAlreadyReservedException();
    }

    public void canceling(int seatNumber) throws SeatNotFoundException, SeatNotReservedYetException {
        if (!checkAvailability(seatNumber, this.seats)) {
            for (Seat item : seats) {
                if (item.getSeatNumber() == seatNumber) {
                    item.setAvailability(true);
                }
            }
            System.out.println("seatNumber" + seatNumber + "cancelled successfully");
        } else
            throw new SeatNotReservedYetException();

    }

    public void displaySeat() throws SeatNotFoundException {
        for (Seat seat : this.seats) {
            System.out.println("Seat Number " + seat.getSeatNumber());//+ " is " + (checkAvailability(seat.getSeatNumber(),this.seats)? "Available" : "Reserved"));
        }
    }

    public void seatExporter() throws IOException {
        StringBuilder string = new StringBuilder();
        int count = 0;
        for (int i = 0; i < numberOfRows; i++) {
            string.append(i + 1).append(":");
            for (int j = 0; j < numberOfColumns; j++) {
                string
                        .append(this.seats.get(count).getSeatNumber())
                        .append(",")
                        .append(this.seats.get(count).isAvailability()).append(",");
                count++;

            }
            string.append("\n");
        }
        importCSV(string.toString(), file);


    }

   /* public void fileExporter() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < seats.size(); i++) {
            stringBuilder.append(seats.get(i).getSeatNumber()).append(",").append(seats.get(i).isAvailability() ? "Available" : "Reserved");
            stringBuilder = new StringBuilder("\n");
        }
        importCSV(stringBuilder.toString(), file);
    }*/

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public Theater() {
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
