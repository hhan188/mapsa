package tamrin13;

import java.util.Scanner;

public class Menu {

    // Declaring the colors
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        System.out.print(ANSI_PURPLE);
        System.out.println("\n* * * * Theater Seat Reservation System * * * * \n");
        System.out.print(ANSI_RESET);

        Theater theater = TheaterOperation.theaterCreation();

        int result = TheaterOperation.theaterArrangement(theater);
        if (result == 9) {
            System.out.print(ANSI_YELLOW);
            System.out.println("==> Exit program ...");
            return;
        }

        mainMenuSelection(theater);


    }

    private static void mainMenuSelection(Theater theater) {
        System.out.println(ANSI_PURPLE);
        System.out.println("=== Welcome to the " + theater.getName() + " theater ===");
        System.out.print(ANSI_GREEN);
        System.out.println("(1) View the seating arrangement");
        System.out.println("(2) Reserve an available seat");
        System.out.println("(3) Cancel a reserved seat");
        System.out.println("(4) Check seat availability by seat number");
        System.out.println("(5) Import theater arrangement and status from csv file (Load)");
        System.out.println("(6) Export theater arrangement and status to csv file (Save)");
        System.out.println("(9) Exit this program");
        System.out.print(ANSI_RESET);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Select your operation by number: ");

        mainMenuOperation(theater, readInt());
    }

    private static void mainMenuOperation(Theater theater, int userSelection) {

        if (userSelection == 9) {
            System.out.print(ANSI_YELLOW);
            System.out.println("==> Exit program ...");
            return;
        }

        switch (userSelection) {
            case 0 -> mainMenuSelection(theater);
            case 1 -> TheaterOperation.displaySeatsArrangement(theater);
            case 2 -> TheaterOperation.reserveSeat(theater);
            case 3 -> TheaterOperation.cancelSeat(theater);
            case 4 -> TheaterOperation.checkSeatStatus(theater);
            case 5 -> FileOperation.fileImport(theater);
            case 6 -> FileOperation.fileExport(theater);
            default -> System.out.println(ANSI_RED + "==> Invalid number Selected" + ANSI_RESET);
        }

        mainMenuSelection(theater);
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        int inputInt = -1;
        while (inputInt == -1) {
            try {
                inputStr = sc.nextLine();
                inputInt = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "==> Invalid input!, try again ..."+ ANSI_RESET);
                System.out.print("Enter valid positive integer number: ");
            }
        }
        return inputInt;
    }

}
