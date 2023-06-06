package practice13Test;

public class Seat {
    private int seatNumber;
    private int rowNumber;
    private boolean availability;
    public Seat(int seatNumber, int rowNumber, boolean availability) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.availability = availability;
    }

    public Seat() {
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
