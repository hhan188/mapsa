package com.Practice13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Theater
{
    private static String name;
    private static int row;
    private static int column;
    private static List <Seat> seatList = new ArrayList<>();

    public Theater(String name, int row, int column)
    {
        Theater.name = name;
        Theater.row = row;
        Theater.column = column;

        setSeatList();
    }

    public Theater() {

    }


    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList()
    {
        Seat seat;
        int seatNumber = 0;

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                seat = new Seat(i, j, true);
                seatNumber++;
                seat.setSeatNumber(seatNumber);
                seatList.add(seat);
            }
        }
    }

    public static void displaySeatsArrangement ()
    {
        if (row == 0 || column == 0)
        {
            System.out.println("\n*** There is No Seat ***");
        }
        else
        {
            for (int i=0; i < row; i++)
            {
                for (int j=0; j < column; j++)
                {
                    if (checkSeatAvailability(i, j))
                    {
                        System.out.print(" O ");
                    }
                    else
                    {
                        System.out.print(" X ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void reserveSeat (int seatNumber)
    {
        try
        {
            if (seatList.size() == 0)
            {
                throw new SeatNotFoundException("*** Seat Not Found ***");
            }

            for (int i=0; i < seatList.size(); i++)
            {
                if (seatList.get(i).getSeatNumber() == seatNumber)
                {
                    if (seatList.get(i).isAvailability())
                    {
                        seatList.get(i).setAvailability(false);
                        seatList.set(i, seatList.get(i));
                        System.out.println("\n*** Seat " + seatList.get(i).getSeatNumber() + " Reserved ***");
                    }
                    else
                    {
                        throw new SeatReservedException("*** Seat " + seatList.get(i).getSeatNumber() + " Have Been Reserved ***");
                    }
                }
            }
        }
        catch (SeatReservedException | SeatNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static void cancelReserve (int seatNumber)
    {
        try
        {
            if (seatList.size() == 0)
            {
                throw new SeatNotFoundException("*** Seat Not Found ***");
            }

            for (int i=0; i < seatList.size(); i++)
            {
                if (seatList.get(i).getSeatNumber() == seatNumber) {

                    if (!seatList.get(i).isAvailability())
                    {
                        seatList.get(i).setAvailability(true);
                        seatList.set(i, seatList.get(i));
                        System.out.println("\n*** Seat " + seatList.get(i).getSeatNumber() + " Unreserved ***");
                    }
                    else
                    {
                        throw new SeatReservedException("*** Seat " + seatList.get(i).getSeatNumber() + " Already Available ***");
                    }
                }
            }
        }
        catch (SeatReservedException | SeatNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkSeatAvailability(int row, int column)
    {
        try
        {
            if (seatList.size() == 0)
            {
                throw new SeatNotFoundException("*** Seat Not Found ***");
            }
            for (Seat item : seatList)
            {
                if (item.getRow() == row && item.getColumn() == column)
                {
                    return item.isAvailability();
                }
            }
        }
        catch (SeatNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static boolean checkSeatAvailability(int seatNumber) throws SeatNotFoundException {

        if (seatList.size() == 0)
        {
            throw new SeatNotFoundException("*** Seat Not Found ***");
        }
        for (Seat item : seatList)
        {
            if (item.getSeatNumber() == seatNumber)
            {
                return item.isAvailability();
            }
        }
        return false;
    }


    public static void writeToFile ()
    {
        if (!seatList.isEmpty())
        {
            StringBuilder write = new StringBuilder();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Practice13/" + name + ".csv")))
            {
                for (Seat seat : seatList) {
                    write.append(seat.getSeatNumber()).append(" ").append(seat.getRow()).append(" ").append(seat.getColumn()).append(" ").append(seat.isAvailability());
                    writer.write(String.valueOf(write));
                    write = new StringBuilder("\n");
                }
                System.out.println("\n*** File Saved ***");
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("\n*** There is No Theater To Save! ***");
        }

    }

    public static void readFromFile (String fileName)
    {
        int counter = 0;
        String [] read;
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Practice13/" + fileName + ".csv")))
        {
            while ((line = reader.readLine()) != null)
            {
                Seat seat = new Seat();
                read = line.split(" ");
                seat.setSeatNumber(Integer.parseInt(read[0]));
                seat.setRow(Integer.parseInt(read[1]));
                seat.setColumn(Integer.parseInt(read[2]));
                seat.setAvailability(Boolean.parseBoolean(read[3]));
                seatList.add(seat);
                counter++;
            }
            row = seatList.get(counter-1).getRow()+1;
            column = seatList.get(counter-1).getColumn()+1;
            name = fileName;

            System.out.println("\n*** Theater " + fileName + " Loaded ***");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
