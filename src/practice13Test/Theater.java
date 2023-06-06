package practice13Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String theaterName;
    private int numberOfRows;
    private int numberOfColumns;
    static List<Seat> seats = new ArrayList<>();
    static String file = "TheaterSeats.csv";
    public List<Seat> getSeats() {
        return seats;
    }

    public Theater(String theaterName, int numberOfRows, int numberOfColumns) {
        this.theaterName = theaterName;
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        createSeats();
    }
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
    private void createSeats() {
        int seatNumber = 1;
        for (int i = 1 ; i <= numberOfRows; i++) {
            for (int j = 1 ; j <= numberOfColumns; j++) {
                seats.add(new Seat(seatNumber, i, true));
                seatNumber++;
            }
        }
    }
    public void reserving(int seatNumber)throws SeatIsAlreadyReservedException,SeatNotFoundException{
        boolean notFound = true;
        for (Seat item : seats){
            if (item.getSeatNumber() == seatNumber){
                if (item.isAvailability()) {
                    item.setAvailability(false);
                    notFound = false;
                } else {
                    throw new SeatIsAlreadyReservedException();
                }
            }
        }
        if (notFound){
            throw new SeatNotFoundException();
        }
    }
    public void canceling(int seatNumber) throws SeatNotFoundException, SeatNotReservedYetException {
        boolean notFound = true;
        for (Seat item : seats){
            if (item.getSeatNumber() == seatNumber){
                if (!item.isAvailability()){
                    item.setAvailability(true);
                    notFound = false;
                }
                else {
                    throw new SeatNotReservedYetException();
                }
            }
        }
        if (notFound){
            throw new SeatNotFoundException();
        }
    }
    public void checkAvailability(int seatNumber){
        for (Seat item : seats){
            if (item.getSeatNumber() == seatNumber){
                System.out.println("Seat is " + (item.isAvailability() ? "Available" : "Reserved"));
            }
        }
    }
    public static void fileImporter() throws IOException {
        String line;
        String[] reader = new String[2];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while ((line = bufferedReader.readLine()) != null){
                for (int i = 0; i < reader.length; i++) {
                    reader = line.split(",");
                    seats.get(i).setSeatNumber(Integer.parseInt(reader[0]));
                    seats.get(i).setAvailability(Boolean.parseBoolean(reader[1]));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void fileExporter(){
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            for (int i = 0 ; i < seats.size() ; i++){
                stringBuilder.append(seats.get(i).getSeatNumber()).append(",").append(seats.get(i).isAvailability() ? "Available" : "Reserved");
                bufferedWriter.write(String.valueOf(stringBuilder));
                stringBuilder = new StringBuilder("\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
