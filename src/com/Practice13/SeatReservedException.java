package com.Practice13;

public class SeatReservedException extends Exception
{
    public SeatReservedException() {
    }

    public SeatReservedException(String message) {
        super("\n" + message);
    }
}
