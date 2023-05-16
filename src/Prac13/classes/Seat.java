package Prac13.classes;

import java.util.Objects;

public class Seat {
    private int seatNumber, seatRow;
    private boolean avalability;

    public Seat(int seatNumber, int seatRow, boolean avalability) {
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.avalability = avalability;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public boolean isAvalability() {
        return avalability;
    }

    public void toggleAvalability() {
        avalability = !avalability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return seatNumber == seat.seatNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatNumber);
    }
}
