package com.practise11.Tamrin6;

public abstract class Flight
{
    private static boolean isBooked;

    public boolean isBooked() {

        return isBooked;
    }

    public static void setBooked(boolean booked) {
        isBooked = booked;
    }

    public static void booked () throws SeatAlreadyBookedException
    {
        if (isBooked)
        {
            throw new SeatAlreadyBookedException("Seat Already Booked");
        }
        else
        {
            System.out.println("The Seat Is Available");
        }
    }

    public boolean canceling ()
    {
        return isBooked = false;
    }
}
