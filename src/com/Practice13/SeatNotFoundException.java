package com.Practice13;

public class SeatNotFoundException extends Exception
{
    public SeatNotFoundException() {
    }

    public SeatNotFoundException(String message) {
        super("\n" + message);
    }
}
