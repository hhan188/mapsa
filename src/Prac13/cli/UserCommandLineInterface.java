package Prac13.cli;

import Prac13.classes.Theater;
import Prac13.exceptions.SeatAlreadyReservedException;
import Prac13.exceptions.SeatIsNotReservedYetExecption;
import Prac13.exceptions.SeatNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCommandLineInterface {
    private ArrayList<Theater> theaters;
    private Scanner scanner;

    public UserCommandLineInterface() {
        this.theaters = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println(getMainMenuText());
            int mainMenuChoice = scanner.nextInt();
            switch (mainMenuChoice) {
                case 1 -> {
                    theatersMenu();
                }
                case 2 -> {
                    createNewTheater();
                }
                case 3 -> {
                    System.out.println("Goodby!");
                    exit = true;
                }
            }
        }
    }

    private String getMainMenuText() {
        StringBuilder builder = new StringBuilder();

        builder
                .append("welcome to theater manage system.\n")
                .append("1.show theaters\n")
                .append("2.create new theater\n")
                .append("3.exit\n");

        return builder.toString();
    }

    private void theatersMenu() {
        StringBuilder builder = new StringBuilder();
        if (theaters.size() == 0) {
            builder.append("no theater are created :(\n")
                    .append("create one ? (y/n)");
        } else {
            int counter = 1;
            for (Theater theater : theaters) {
                builder
                        .append("--------------------\n")
                        .append(counter)
                        .append(".")
                        .append(theater.getName())
                        .append("\n")
                        .append("--------------------\n");
            }
            builder.append("-1 to go back");
        }

        System.out.println(builder.toString());

        if (scanner.hasNextInt()) {
            int theatersMenuChoice = scanner.nextInt();
            if (theatersMenuChoice != -1) {
                theaterMenu(theatersMenuChoice);
            }
        } else {
            String theatersMenuChoice = scanner.next();
            if (theatersMenuChoice.equalsIgnoreCase("y")) {
                createNewTheater();
            }
        }
    }

    private void theaterMenu(int counter) {
        StringBuilder builder = new StringBuilder();
        Theater currentTheater = theaters.get(counter - 1);

        builder
                .append("------------------------------\n")
                .append(currentTheater.getName())
                .append("\n")
                .append("------------------------------\n")
                .append("a.reserve a seat\n")
                .append("b.cancele a reservation\n")
                .append("c.show seats and status\n")
                .append("d.check seat availability\n")
                .append("e.import seat data\n")
                .append("f.export seat data\n")
                .append("exit.exit\n")
                .append("------------------------------\n");

        boolean exit = false;
        while (!exit) {
            System.out.println(builder.toString());

            String theaterMenuChoice = scanner.next();
            switch (theaterMenuChoice) {
                case "a" -> { // reserve a seat number
                    System.out.println("enter a seat number");
                    int seatNum = scanner.nextInt();

                    try {
                        currentTheater.reserveSeat(seatNum);
                    } catch (SeatNotFoundException | SeatAlreadyReservedException e) {
                        System.err.println(e.getMessage());
                    }

                    System.out.println("seat with number " + seatNum + " marked as reserved");
                }

                case "b" -> { //cancel reservation
                    System.out.println("enter a seat number");
                    int seatNum = scanner.nextInt();

                    try {
                        currentTheater.canceleReservation(seatNum);
                    } catch (SeatIsNotReservedYetExecption | SeatNotFoundException e) {
                        System.err.println(e.getMessage());
                    }

                    System.out.println("seat with number " + seatNum + " marked as available");
                }

                case "c" -> { // display all seats
                    System.out.println(currentTheater.displaySeats());
                }

                case "d" -> { // check availability of one seat
                    System.out.println("enter a seat number");
                    int seatNum = scanner.nextInt();

                    try {
                        currentTheater.checkSeatAvailability(seatNum);
                    } catch (SeatNotFoundException e) {
                        System.err.println(e.getMessage());
                    }

                }

                case "e" -> { //import from csv file
                    System.out.println("enter file name included in imports dir");
                    String fileName = scanner.next();
                    currentTheater.importSeatsFromCsv(fileName);
                    System.out.println("success!");
                }

                case "f" -> { //export from csv file
                    currentTheater.exportSeatsToCsv();
                }

                case "exit" -> {
                    exit = true;
                }
            }
        }
    }

    private void createNewTheater() {
        System.out.println("------------------------------");
        System.out.println("enter theater name");
        String name = scanner.next();
        System.out.println("enter theater seats rows");
        int rows = scanner.nextInt();
        System.out.println("enter theater seats cols");
        int cols = scanner.nextInt();

        Theater newTheater = new Theater(name, rows, cols);
        theaters.add(newTheater);

        System.out.println("new theater with name " + name + " is succesfully added!");
        System.out.println("------------------------------\n");
    }

    public ArrayList<Theater> getTheaters() {
        return theaters;
    }
}
