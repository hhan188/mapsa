package practice13Test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SeatAlreadyReservedException, SeatIsAlreadyReservedException, SeatNotFoundException, SeatNotReservedYetException {
            System.out.println("Welcome To The Theater Program");
            System.out.println("Press 1 to Create a New Theater");
            System.out.println("Press 2 For Importing a File");
            Scanner scanner = new Scanner(System.in);
            String controlPanel = scanner.next();
            boolean isMade = false;
            while (!controlPanel.equalsIgnoreCase("End")) {
                switch (controlPanel) {
                    case "1":
                        System.out.println("Please Enter a Name");
                        String name = scanner.next();
                        System.out.println("Please Enter a Number For Row");
                        int row = scanner.nextInt();
                        System.out.println("Please Enter a Number For Column");
                        int column = scanner.nextInt();
                        Theater theater = new Theater(name, row, column);
                        isMade = true;
                        System.out.println("The New Theater Was Made");
                        System.out.println("------------------------------------------");
                        while (isMade) {
                            System.out.println("Press 1 For Displaying All The Seats");
                            System.out.println("Press 2 For Reserving a Seat");
                            System.out.println("Press 3 For Canceling a Reservation");
                            System.out.println("Press 4 For Checking a Seat Availability");
                            System.out.println("Press 5 For Exporting To a File");
                            String command = scanner.next();
                            switch (command) {
                                case "1":
                                    System.out.println("*************************************");
                                    for (Seat seat : theater.seats) {
                                        System.out.println("Seat With Number " + seat.getSeatNumber() + " is " + (seat.isAvailability() ? "Available" : "Reserved"));
                                    }
                                    System.out.println("*************************************");
                                    break;
                                case "2":
                                    System.out.println("Please Enter a Seat Number To Reserve");
                                    int seatNumber1 = scanner.nextInt();
                                    theater.reserving(seatNumber1);
                                    break;
                                case "3":
                                    System.out.println("Please Enter a Seat Number For Canceling The Reservation");
                                    int seatNumber2 = scanner.nextInt();
                                    theater.canceling(seatNumber2);
                                    break;
                                case "4":
                                    System.out.println("Please Enter Your Seat Number");
                                    int seatNumber3 = scanner.nextInt();
                                    theater.checkAvailability(seatNumber3);
                                    break;
                                case "5":
                                    Theater.fileExporter();
                                    System.out.println("Theater Saved");
                                break;
                            }
                        }

                }
            }



    }
}