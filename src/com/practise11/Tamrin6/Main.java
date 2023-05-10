package com.practise11.Tamrin6;

public class Main
{
    public static void main(String[] args)
    {

        Flight.setBooked(false);
        try {
            Flight.booked();
        } catch (SeatAlreadyBookedException e) {
            System.err.println(e.getMessage());
        }

        Flight.setBooked(true);
        try {
            Flight.booked();
        } catch (SeatAlreadyBookedException e) {
            System.err.println(e.getMessage());
        }
    }
}
