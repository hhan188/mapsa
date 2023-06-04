package Practice13;

import java.io.IOException;
import java.util.Scanner;

public class UserInteraction {
    Scanner scanner = new Scanner(System.in);

    public UserInteraction() {
    }

    public void makeTheater() throws SeatNotFoundException, SeatNotReservedYetException, IOException {
        System.out.println("Please Enter a Name Theater:");
        String name = scanner.next();
        System.out.println("Please Enter a Number For Rows :");
        int row = scanner.nextInt();
        System.out.println("Please Enter a Number For Columns :");
        int columns = scanner.nextInt();
        Theater theater = new Theater(name, row, columns);
        System.out.println("**********************");
        System.out.println("New Theater Was Made :)");
        System.out.println("**********************");
        boolean resume = true;
        while (resume) {
            System.out.println("Enter 1 For Displaying Seats :");
            System.out.println("Enter 2 For Reserving a Seat :");
            System.out.println("Enter 3 For Canceling a Seat :");
            System.out.println("Enter 4 For Check a Seat Availability Status :");
            System.out.println("Enter 5 For Exporting");
            System.out.println("Enter 0 For Exit");
            int controlPanel = scanner.nextInt();
            switch (controlPanel) {
                case 1:
                    System.out.println("***********************************************************************************************************");
                    theater.displaySeat();
                    System.out.println("***********************************************************************************************************");
                    break;
                case 2:
                    System.out.println("****************************");
                    System.out.println("Please Enter a Seat Number :");
                    int seatNumber1 = scanner.nextInt();
                    try {
                        theater.reserving(seatNumber1);
                    } catch (SeatNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (SeatIsAlreadyReservedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("*****************************************");
                    break;
                case 3:
                    System.out.println("****************************");
                    System.out.println("Please Enter a Seat Number :");
                    int seatNumber2 = scanner.nextInt();
                    theater.canceling(seatNumber2);
                    System.out.println("****************************************************");
                    break;
                case 4:
                    System.out.println("****************************");
                    System.out.println("Please Enter a Seat Number :");
                    int seatNumber3 = scanner.nextInt();
                    try {
                        theater.checkAvailability(seatNumber3, theater.getSeats());
                    } catch (SeatNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("****************************");
                    break;
                case 5:
                    theater.seatExporter();
                    break;
                case 0:
                    resume = false;
                    break;
            }
        }
    }
}
