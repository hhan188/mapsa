package Prac13.classes;

import Prac13.exceptions.SeatAlreadyReservedException;
import Prac13.exceptions.SeatIsNotReservedYetExecption;
import Prac13.exceptions.SeatNotFoundException;
import java.util.ArrayList;

public class Theater {
    private String name;
    private ArrayList<Seat> seats;
    private int rows, cols;

    private final FileImporter fileImporter;
    private final FileExporter fileExporter;

    public Theater(String name, int rows, int cols) {
        this.name = name;
        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
        this.fileImporter = new FileImporter();
        this.fileExporter = new FileExporter();
        fillSeats();
    }

    /**
     * Fill seats based on rows and cols count of theater
     */
    private void fillSeats() {
        int seatCount = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                seats.add(new Seat(seatCount, seatCount, true));
                seatCount++;
            }
        }
    }

    /**
     * reserve a seat by given seat object
     * @param seat seat object
     * @return true when seat is succesfully reserved
     * @throws SeatNotFoundException throws an exception when seat is not found in this theater
     * @throws SeatAlreadyReservedException throws an exception when given seat is already reserved
     */
    public boolean reserveSeat(Seat seat) throws SeatNotFoundException, SeatAlreadyReservedException {
        if (!seats.contains(seat))
            throw new SeatNotFoundException();

        if (!seat.isAvalability())
            throw new SeatAlreadyReservedException();

        seat.toggleAvalability();
        return true;
    }

    /**
     * reserve a seat by given seat number
     * @param seatNumber seat number
     * @return true when seat is succesfully reserved
     * @throws SeatNotFoundException throws an exception when seat is not found in this theater
     * @throws SeatAlreadyReservedException throws an exception when given seat is already reserved
     */
    public boolean reserveSeat(int seatNumber) throws SeatNotFoundException, SeatAlreadyReservedException {
        Seat seat = seats.stream()
                .filter(s -> s.getSeatNumber() == seatNumber)
                .findFirst()
                .orElseThrow(
                        () -> new SeatNotFoundException()
                );

        if (!seat.isAvalability())
            throw new SeatAlreadyReservedException();

        seat.toggleAvalability();
        return true;
    }

    /**
     * cancele seat reservation by given seat object
     * @param seat seat object
     * @return true when reservation is succesfully canceled
     * @throws SeatNotFoundException throws an exception when seat is not found in this theater
     * @throws SeatIsNotReservedYetExecption throws an exception when given seat is not resverd yet
     */
    public boolean canceleReservation(Seat seat) throws SeatNotFoundException, SeatIsNotReservedYetExecption {
        if (!seats.contains(seat))
            throw new SeatNotFoundException();

        if (seat.isAvalability())
            throw new SeatIsNotReservedYetExecption();

        seat.toggleAvalability();
        return true;
    }

    /**
     * cancele seat reservation by given seat object
     * @param seatNumber seat number
     * @return true when reservation is succesfully canceled
     * @throws SeatNotFoundException throws an exception when seat is not found in this theater
     * @throws SeatIsNotReservedYetExecption throws an exception when given seat is not resverd yet
     */
    public boolean canceleReservation(int seatNumber) throws SeatIsNotReservedYetExecption, SeatNotFoundException {
        Seat seat = seats.stream()
                .filter(s -> s.getSeatNumber() == seatNumber)
                .findFirst()
                .orElseThrow(
                        () -> new SeatNotFoundException()
                );

        if (seat.isAvalability())
            throw new SeatIsNotReservedYetExecption();

        seat.toggleAvalability();
        return true;
    }

    /**
     * display seats numbers and their availability in order with rows and columns
     * @return seats and their availability
     */
    public String displaySeats() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= rows; i++) {

            builder
                    .append("-".repeat(cols * 14))
                    .append("\n");

            for (int j = 1; j <= cols; j++) {
                int currentSeatIndex = (i - 1) * cols + j -1;
                Seat currentSeat = seats.get(currentSeatIndex);

                builder
                        .append("  |  ")
                        .append(currentSeat.getSeatNumber())
                        .append(":")
                        .append(currentSeat.isAvalability() ? "av" : "res")
                        .append("  |  ");
            }

            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * check if a seat is available and print its availablity status
     * @param seatNumber seat number
     * @throws SeatNotFoundException throws an exception when seat is not found in this theater
     */
    public void checkSeatAvailability(int seatNumber) throws SeatNotFoundException {
        Seat seat = seats.stream()
                .filter(s -> s.getSeatNumber() == seatNumber)
                .findFirst()
                .orElseThrow(
                        () -> new SeatNotFoundException()
                );
        if (seat.isAvalability())
            System.out.println("seat with number " + seatNumber + " is available");
        else
            System.out.println("seat with number " + seatNumber + " is not available");
    }

    /**
     * import seats from an csv file
     * @param filePath path to csv file
     */
    public void importSeatsFromCsv (String filePath) {
        ArrayList<Seat> importedSeats = fileImporter.extractSeatsFromCsv(filePath);
        setSeats(importedSeats);
    }

    /**
     * create an csv file from seats of this theater object
     */
    public void exportSeatsToCsv() {
        fileExporter.saveCsvFile(name, seats);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    private void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
