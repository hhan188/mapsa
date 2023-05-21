package Practice13;

public class Seat {
    private int seatNumber;
    private int row;
    private boolean availabilityStatus;

    public Seat(int seatNumber, int row, boolean availabilityStatus) {
        this.seatNumber = seatNumber;
        this.row = row;
        this.availabilityStatus = availabilityStatus;
    }

    public Seat() {
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRow() {
        return row;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }


}