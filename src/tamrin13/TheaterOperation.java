package tamrin13;

import java.util.Scanner;

public class TheaterOperation {


    static Theater theaterCreation() {
        //Making user theater
        Scanner sc = new Scanner(System.in);
        System.out.println(Menu.ANSI_BLUE + "=== Defining your theater ===" + Menu.ANSI_RESET);
        System.out.print("Enter the theater name: ");
        String theaterName = sc.nextLine().trim();
        return new Theater(theaterName);
    }


    static int theaterArrangement(Theater theater) {
        System.out.println(Menu.ANSI_GREEN);
        System.out.println("Select the type of seat arrangement");
        System.out.println("(1) Define number of rows and columns");
        System.out.println("(2) Import seat arrangement from csv file");
        System.out.println("(9) Exit this program");
        System.out.print(Menu.ANSI_RESET);
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Select your operation by number: ");

        int userSelection = Menu.readInt();
        while (userSelection != 1 && userSelection != 2 && userSelection != 9) {
            System.out.print("Select valid option number: ");
            userSelection = Menu.readInt();
        }

        if (userSelection == 1) {
            System.out.print("Enter number of theater row: ");
            theater.setTheaterRow(Menu.readInt());
            System.out.print("Enter number of theater column: ");
            theater.setTheaterColumn(Menu.readInt());
            theater.setSeatList(theater.theaterSeatsInitializationByRC());
            return 1;
        }
        if (userSelection == 2) {
            boolean result = FileOperation.fileImport(theater);
            if (!result) {
                theaterArrangement(theater);
            } else
                return 2;
        }
        return 9;
    }

    static void displaySeatsArrangement(Theater theater) {

        theater.displaySeatsArrangement();
    }


    static void reserveSeat(Theater theater) {

        System.out.println(Menu.ANSI_BLUE + "\n === Seat reservation menu ===");
        System.out.print(Menu.ANSI_RESET);

        while (true) {
            System.out.print("Enter the seat number you want to reserve (0 to exit): ");
            int seatNumber = Menu.readInt();
            if (seatNumber == 0)
                return;
            if (!seatNumberIsValid(seatNumber, theater))
                continue;
            boolean result = theater.reserveSeat(seatNumber);
            if (result)
                System.out.println(Menu.ANSI_CYAN + "==> Reservation Successful");
            else
                System.out.println(Menu.ANSI_RED + "==> Reservation Failed");

            System.out.print(Menu.ANSI_RESET);
        }
    }


    static void cancelSeat(Theater theater) {

        System.out.println(Menu.ANSI_BLUE + "\n === Cancel seat reservation ===");
        System.out.print(Menu.ANSI_RESET);

        while (true) {
            System.out.print("Enter the seat number you want to cancel (0 to exit): ");
            int seatNumber = Menu.readInt();
            if (seatNumber == 0)
                return;
            if (!seatNumberIsValid(seatNumber, theater))
                continue;
            boolean result = theater.cancelSeat(seatNumber);
            if (result)
                System.out.println(Menu.ANSI_CYAN + "==> Cancellation Successful");
            else
                System.out.println(Menu.ANSI_RED + "==> Cancellation Failed");

            System.out.print(Menu.ANSI_RESET);
        }
    }


    static void checkSeatStatus(Theater theater) {

        System.out.println(Menu.ANSI_BLUE + "\n === Check seat reservation status ===");
        System.out.print(Menu.ANSI_RESET);

        while (true) {
            System.out.print("Enter the seat number you want to check (0 to exit): ");
            int seatNumber = Menu.readInt();
            if (seatNumber == 0)
                return;
            if (!seatNumberIsValid(seatNumber, theater))
                continue;
            boolean result = theater.checkSeatStatus(seatNumber);
            if (result)
                System.out.println(Menu.ANSI_CYAN + "==> This seat is available");
            else
                System.out.println(Menu.ANSI_PURPLE + "==> This seat is reserved");

            System.out.print(Menu.ANSI_RESET);
        }
    }


    public static boolean seatNumberIsValid(int seatNumber, Theater theater) {
        if (seatNumber <= 0 || seatNumber > theater.getTheaterSize()) {
            System.out.println("==> Seat number is out of range!");
            return false;
        }
        return true;
    }
}
