package com.Practice13;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("*** Welcome To Theater Reservation ***");
        System.out.println("--------------------------------------");
        while (true)
        {
            Theater theater;
            System.out.println();
            System.out.println("Please Select an Option: ");
            System.out.println("--------------------------------------");
            System.out.println("1- New Theater");
            System.out.println("2- Load Theater");
            System.out.println("3- View Seats");
            System.out.println("4- Reserve Seat");
            System.out.println("5- Cancel Seat Reservation");
            System.out.println("6- Check Seat Availability");
            System.out.println("7- Save");
            System.out.println("8- Exit");

            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();

            switch (selection)
            {
                case 1:
                    System.out.println("Enter New Theater Name: (Use \"_\" Instead of \"Space\")");
                    String theaterName = sc.next();
                    System.out.println("Enter Row: ");
                    int row = sc.nextInt();
                    System.out.println("Enter Column: ");
                    int column = sc.nextInt();
                    theater = new Theater(theaterName, row, column);
                    System.out.println("\n*** Theater Created ***");
                    break;

                case 2:
                    System.out.println("Enter Theater Name: ");
                    String name = sc.next();
                    Theater.readFromFile(name);
                    break;

                case 3:
                    System.out.println("Seats:");
                    Theater.displaySeatsArrangement();
                    break;

                case 4:
                    System.out.print("Enter Seat Number: ");
                    int seatNumber = sc.nextInt();
                    Theater.reserveSeat(seatNumber);
                    break;

                case 5:
                    System.out.print("Enter Seat Number: ");
                    seatNumber = sc.nextInt();
                    Theater.cancelReserve(seatNumber);
                    break;

                case 6:
                    System.out.print("Enter Seat Number: ");
                    seatNumber = sc.nextInt();
                    try
                    {
                        if(Theater.checkSeatAvailability(seatNumber))
                        {
                            System.out.println("\n*** Seat " + seatNumber + " Available ***");
                        }
                        else
                        {
                            throw new SeatReservedException("*** Seat " + seatNumber + " Not Available ***");
                        }
                    }
                    catch (SeatReservedException | SeatNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    Theater.writeToFile();
                    break;

                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n*** Wrong Choice! ***");
            }
        }
    }
}
