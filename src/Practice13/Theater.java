package Practice13;

import Practice13.Exceptions.NotReservedYetException;
import Practice13.Exceptions.SeatAlreadyBookedException;
import Practice13.Exceptions.SeatIsNotFindException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String theaterName;
    private int numberOfRows;
    private int numberOfCumulus;
    private boolean availabilityStatus;

    static List<Seat> seats=new ArrayList<>();
    private String file = "fileSeat.csv";

    public Theater() {
    }


    public Theater(String theaterName, int numberOfRows, int numberOfCumulus) {
        this.theaterName = theaterName;
        this.numberOfRows = numberOfRows;
        this.numberOfCumulus = numberOfCumulus;
        createSeatNumber();
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

    public int getNumberOfCumulus() {
        return numberOfCumulus;
    }

    public void setNumberOfCumulus(int numberOfCumulus) {
        this.numberOfCumulus = numberOfCumulus;
    }

    public static List<Seat> getSeats() {
        return seats;
    }

    public static void setSeats(List<Seat> seats) {
        Theater.seats = seats;
    }
    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    private void createSeatNumber(){
        int seatNumber=1;
        for (int i = 1 ; i<=numberOfRows;i++){
            for (int j = 1; j <=numberOfCumulus ; j++) {
                seats.add(new Seat(seatNumber,i,true));
                seatNumber++;
            }
        }
    }
   public void reserving(int seatNumber) throws SeatAlreadyBookedException, SeatIsNotFindException {
        boolean notFound=true;
       for (Seat item:seats) {
           if (item.getSeatNumber()==seatNumber) {
               if (item.isAvailabilityStatus()) {
                   item.setAvailabilityStatus(false);
                   notFound=false;
               }
               else {
                   throw new SeatAlreadyBookedException();
               }
           }
       }
       if (notFound){
           throw new SeatIsNotFindException();
       }
   }
 public void canceling(int seatNumber) throws NotReservedYetException, SeatIsNotFindException {
        boolean found= false;
     for (Seat item:seats) {
         if (item.getSeatNumber()==seatNumber){
             if (!item.isAvailabilityStatus()){
                 item.setAvailabilityStatus(true);
                 found=true;
             }else {
                 throw new NotReservedYetException();
             }
         }
     }if (!found){
         throw new SeatIsNotFindException();
     }
 }
    public void availability(int seatNumber) throws SeatIsNotFindException {

        for (Seat item:seats) {
            if (item.getSeatNumber()==seatNumber){
                if (item.isAvailabilityStatus()){
                    System.out.println(isAvailabilityStatus());

                }else throw new SeatIsNotFindException();
            }

        }
    }
    public static void fileExporter(){
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file"))){
            for (int i = 0; i < seats.size(); i++) {
                stringBuilder.append(seats.get(i).getSeatNumber()).append(",").append(seats.get(i).isAvailabilityStatus()?"Available":"Reserved");
                bufferedWriter.write(String.valueOf(stringBuilder));
                stringBuilder = new StringBuilder("\n");
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void fileImporter(){
        String line;
        String[] reader=new String[3];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ehsan\\workspace\\NewMapsaTraining\\Csv"))){
            while((line=bufferedReader.readLine())!=null){
                for (int i = 0; i < reader.length; i++) {
                    reader=line.split(",");
                    seats.get(i).setRow(Integer.parseInt(reader[0]));
                    seats.get(i).setSeatNumber(Integer.parseInt(reader[1]));
                    seats.get(i).setAvailabilityStatus(Boolean.parseBoolean(reader[3]));

                }
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }



}
