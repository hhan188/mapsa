package com.practice11.Tamrin6;

public class SeatAlreadyBookedException extends Exception
{
    public SeatAlreadyBookedException() {
    }

    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
