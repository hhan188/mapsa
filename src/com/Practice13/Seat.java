package com.Practice13;

public class Seat
{
    private int seatNumber;
    private int row;
    private int column;
    private boolean availability;

    public Seat(int row, int column, boolean availability)
    {
        this.row = row;
        this.column = column;
        this.availability = availability;
    }

    public Seat(int row, int column)
    {
        this.row = row;
        this.column = column;
    }

    public Seat()
    {

    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setRow(int row) {
        this.row = row;
    }
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
