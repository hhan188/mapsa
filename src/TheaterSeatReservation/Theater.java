package TheaterSeatReservation;

import TheaterSeatReservation.Exceptions.SeatReservationException;
import TheaterSeatReservation.Exceptions.WrongSeatNumberException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static TheaterSeatReservation.UserCommandLine.start;

public class Theater {
    private final String theaterName;
    private final int rows;
    private final int columns;
    private List<Seat> theaterSeats = new ArrayList<>();

    public Theater(String theaterName, int rows, int columns) {
        this.theaterName = theaterName;
        this.rows = rows;
        this.columns = columns;
        makeTheater();
    }

    public void makeTheater() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                theaterSeats.add(new Seat(j, i));
            }
        }
    }

    public String displaySeatingArrangement() {
        StringBuilder string = new StringBuilder();
        int counter = 0;
            if (counter == 0) {
                string.append("\t");
                for (int z = 0; z < columns; z++)
                    string.append(z).append(" ");
            }
            for (int j = 0; j < theaterSeats.size(); j++) {
                if (j%columns == 0) {
                    string.append("\n");
                    string.append(counter).append("\t");
                    counter++;
                }
                string.append(theaterSeats.get(j).getStatus()).append(" ");
            }
        System.out.println(string);
        return string.toString();
    }

    public void exportSeatArrangeToCSV(String path) throws WrongSeatNumberException, SeatReservationException {
        File csvFile = new File(path + ".csv");
        try (FileWriter fileWriter = new FileWriter(csvFile)) {
                for (int j = 0; j < theaterSeats.size(); j++) {
                    if (j%rows==0 && j!=0)
                        fileWriter.write('\n');
                    fileWriter.write(theaterSeats.get(j).getStatus() + ",");
                }
                start();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void reserve(Seat seat) throws SeatReservationException, WrongSeatNumberException, FileNotFoundException {

        if (this.rows < seat.getRow() || this.columns < seat.getSeatColumn())
            throw new WrongSeatNumberException("Enter a valid integer and choose column between 0 and " + columns + ", row between 0 and " + rows);

        if (seat.getStatus().equals("-"))
            throw new SeatReservationException("The seat you choose has been reserved ,Choose another one");

        for (Seat target : theaterSeats) {
            if (target.getSeatColumn() == seat.getSeatColumn() && target.getRow() == seat.getRow()) {
                target.setStatus("-");
                seat.setStatus("-");
                System.out.println("Your reservation successfully done. \nYour seat at row \"" + seat.getRow() + "\" and column \"" + seat.getSeatColumn() + "\".");
            }
        }
        start();
    }

    public void reserveForImport(Seat seat) throws SeatReservationException, WrongSeatNumberException, FileNotFoundException {

        if (this.rows < seat.getRow() || this.columns < seat.getSeatColumn())
            throw new WrongSeatNumberException("Enter a valid integer and choose column between 0 and " + columns + ", row between 0 and " + rows);

        if (seat.getStatus().equals("-"))
            throw new SeatReservationException("The seat you choose has been reserved ,Choose another one");

        for (Seat target : theaterSeats) {
            if (target.getSeatColumn() == seat.getSeatColumn() && target.getRow() == seat.getRow()) {
                target.setStatus("-");
                seat.setStatus("-");
                System.out.println("Your reservation successfully done. \nYour seat at row \"" + seat.getRow() + "\" and column \"" + seat.getSeatColumn() + "\".");
            }
        }
    }

    public void cancel(Seat seat) throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        if (this.rows < seat.getRow() || this.columns < seat.getSeatColumn())
            throw new WrongSeatNumberException("Enter a valid integer and choose column between A and " + columns + ", row between 0 and " + rows);
        for (Seat target : theaterSeats) {
            if (target.getSeatColumn() == seat.getSeatColumn() && target.getRow() == seat.getRow()) {
                if (target.getStatus().equals("+"))
                    throw new SeatReservationException("The seat you choose has never been reserved ,Please choose your reserved seat for cancellation one.");
                target.setStatus("+");
                seat.setStatus("+");
                System.out.println("Your reservation cancelled successfully.");
            }
        }
        start();

    }

    public void checkSeat(Seat seat) throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        if (this.rows < seat.getRow() || this.columns < seat.getSeatColumn())
            throw new WrongSeatNumberException("Enter a valid integer and choose column between A and " + columns + ", row between 0 and " + rows);

        for (Seat target : theaterSeats) {
            if (target.getSeatColumn() == seat.getSeatColumn() && target.getRow() == seat.getRow()) {
                System.out.println("Seat you want to check in row " + target.getRow() + " and column " + target.getSeatColumn() + " status is \"" + target.getStatus() + "\"");
            }

        }
        start();
    }

    public String getTheaterName() {
        return theaterName;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}