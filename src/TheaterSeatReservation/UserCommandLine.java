package TheaterSeatReservation;


import TheaterSeatReservation.Exceptions.SeatReservationException;
import TheaterSeatReservation.Exceptions.WrongSeatNumberException;

import javax.swing.text.View;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class UserCommandLine {
    private static List<Theater> theaters = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void welcome() {
        System.out.println("██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗     ████████╗██╗  ██╗███████╗ █████╗ ████████╗███████╗██████╗      █████╗ ██████╗ ██████╗ \n" +
                "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ╚══██╔══╝██║  ██║██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗\n" +
                "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║       ██║   ███████║█████╗  ███████║   ██║   █████╗  ██████╔╝    ███████║██████╔╝██████╔╝\n" +
                "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║       ██║   ██╔══██║██╔══╝  ██╔══██║   ██║   ██╔══╝  ██╔══██╗    ██╔══██║██╔═══╝ ██╔═══╝ \n" +
                "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝       ██║   ██║  ██║███████╗██║  ██║   ██║   ███████╗██║  ██║    ██║  ██║██║     ██║     \n" +
                " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝        ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝    ╚═╝  ╚═╝╚═╝     ╚═╝     \n" +
                "                                                                                                                                                                              ");
    }

    public static void start() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        System.out.println("""
                Please select from the following options:
                1. Make Theater
                2. View available shows
                3. Make a reservation
                4. See available seat
                5. Cancel a reservation
                6. Export to a CSV File
                7. Import from a CSV File
                8. Clear shows
                9. Exit

                Enter the number corresponding to your choice:""");

        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                cmdMakeTheater();
            case 2:
                availableShows();
            case 3:
                makeReservation();
            case 4:
                displaySeat();
            case 5:
                cancelReservation();
            case 6:
                exportToCSV();
            case 7:
                importFromCSV();
            case 8:
                clearShows();
            default:
                System.out.println("See You!");
                break;
        }
    }

    private static int counter = 0;

    public static void cmdMakeTheater() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        if (counter < 3) {
            System.out.println("Enter Your Theater Name");
            String theaterName = sc.next();
            System.out.println("Enter Your Theater seat row");
            int theaterRow = sc.nextInt();
            System.out.println("Enter Your Theater Seat column");
            int theaterCol = sc.nextInt();
            theaters.add(new Theater(theaterName, theaterRow, theaterCol));
            counter++;
        } else {
            System.out.println("You can't create more than 3 shows ! \nYou can clear shows list and make some new of them.\nDo you want to clear? Y/N");
            String str = sc.next();
            if (str.equalsIgnoreCase("y"))
                clearShows();
        }
        start();
    }

    public static void availableShows() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        if (counter == 0) {
            System.out.println("We don't have any upcoming show right now");
            start();
        }
        makeReservation();
    }

    public static void makeReservation() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        if (counter == 0) {
            System.out.println("You must make a show first");
            cmdMakeTheater();
        }
        int counter = 1;
        for (Theater theater : theaters) {
            System.out.println(counter + "." + theater.getTheaterName());
            counter++;
        }
        System.out.println("Choose one of the shows for reservation !");
        int showMenu = sc.nextInt();
        if (showMenu == 1) {
            System.out.println("Choose row for reservation between 0 and " + (theaters.get(0).getRows() - 1));
            int row = sc.nextInt();
            System.out.println("Choose column for reservation between 0 and " + (theaters.get(0).getColumns() - 1));
            int col = sc.nextInt();
            theaters.get(0).reserve(new Seat(col, row));
        }
        if (showMenu == 2) {
            if (theaters.size() < 2)
                cmdMakeTheater();
            System.out.println("Choose row for reservation between 0 and " + (theaters.get(1).getRows() - 1));
            int row = sc.nextInt();
            System.out.println("Choose column for reservation between 0 and " + (theaters.get(1).getColumns() - 1));
            int col = sc.nextInt();
            theaters.get(1).reserve(new Seat(col, row));
        }
        if (showMenu == 3) {
            if (theaters.size() < 3)
                cmdMakeTheater();
            System.out.println("Choose row for reservation between 0 and " + (theaters.get(2).getRows() - 1));
            int row = sc.nextInt();
            System.out.println("Choose column for reservation between 0 and " + (theaters.get(2).getColumns() - 1));
            int col = sc.nextInt();
            theaters.get(1).reserve(new Seat(col, row));
        }
        if (showMenu > 3)
            cmdMakeTheater();
    }

    public static void cancelReservation() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        if (counter == 0) {
            System.out.println("You must make a show first");
            cmdMakeTheater();
        }
        int counter = 1;
        for (Theater theater : theaters) {
            System.out.println(counter + "." + theater.getTheaterName());
            counter++;
        }
        System.out.println("Choose one of the shows for cancellation !");
        int showMenu = sc.nextInt();
        if (showMenu == 1) {
            System.out.println("Choose row for cancellation between 0 and " + theaters.get(0).getRows());
            int row = sc.nextInt();
            System.out.println("Choose column for cancellation between 0 and " + theaters.get(0).getColumns());
            int col = sc.nextInt();
            theaters.get(0).cancel(new Seat(col, row));
        }
        if (showMenu == 2) {
            if (theaters.size() < 2)
                cmdMakeTheater();
            System.out.println("Choose row for cancellation between 0 and " + theaters.get(1).getRows());
            int row = sc.nextInt();
            System.out.println("Choose column for cancellation between 0 and " + theaters.get(1).getColumns());
            int col = sc.nextInt();
            theaters.get(1).cancel(new Seat(col, row));
        }
        if (showMenu == 3) {
            if (theaters.size() < 3)
                cmdMakeTheater();
            System.out.println("Choose row for cancellation between 0 and " + theaters.get(2).getRows());
            int row = sc.nextInt();
            System.out.println("Choose column for cancellation between 0 and " + theaters.get(2).getColumns());
            int col = sc.nextInt();
            theaters.get(1).cancel(new Seat(col, row));

        }
    }

    public static void displaySeat() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        int counter = 1;
        for (Theater theater : theaters) {
            System.out.println(counter + "." + theater.getTheaterName());
            counter++;
        }
        System.out.println("Choose Your show you want :");
        int choose = sc.nextInt();
        if (choose == 1)
            theaters.get(0).displaySeatingArrangement();
        else if (choose == 2)
            theaters.get(1).displaySeatingArrangement();
        else if (choose == 3)
            theaters.get(2).displaySeatingArrangement();
        else
            System.out.println("This is unavailable ,may you must make it first!");
        start();

    }

    public static void exportToCSV() throws WrongSeatNumberException, SeatReservationException {
        int counter = 1;
        for (Theater theater : theaters) {
            System.out.println(counter + "." + theater.getTheaterName());
            counter++;
        }
        System.out.println("Choose Your show you want :");
        int choose = sc.nextInt();
        System.out.println("Enter your path for export .csv file");
        sc.nextLine();
        String path = sc.nextLine();
        if (choose == 1)
            theaters.get(0).exportSeatArrangeToCSV(path);
        else if (choose == 2)
            theaters.get(1).exportSeatArrangeToCSV(path);
        else if (choose == 3)
            theaters.get(2).exportSeatArrangeToCSV(path);
    }

    public static void importFromCSV() throws FileNotFoundException, WrongSeatNumberException, SeatReservationException {
        System.out.println("Enter your file's path");
        sc.nextLine();
        String path = sc.nextLine();
        List<String[]> contents = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Path.of(path + ".csv"))) {
            String line = br.readLine();
            while (line != null) {
                contents.add(line.split(","));
                line = br.readLine();
            }
            System.out.println("Enter your theater name ");
            String theaterName = sc.next();
            theaters.add(new Theater(theaterName, contents.size(), contents.get(0).length));
            int rowCounter = 0;
            for (Theater theater : theaters)
                if (theater.getTheaterName().equals(theaterName))
                    for (String[] item : contents) {
                        for (int i = 0; i < item.length; i++) {
                            if (item[i].equals("-"))
                                theater.reserveForImport(new Seat(i, rowCounter));
                        }
                        rowCounter++;
                    }

        } catch (IOException e) {
            System.err.println("File not Found!");
        }
        start();

    }

    public static void clearShows() throws WrongSeatNumberException, SeatReservationException, FileNotFoundException {
        counter = 0;
        theaters.clear();
        start();
    }

}
