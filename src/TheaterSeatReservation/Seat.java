package TheaterSeatReservation;

public class Seat {
    private int seatColumn;
    private int row;
    private String status = "+";

    public Seat(int seatColumn, int row) {
        this.seatColumn = seatColumn;
        this.row = row;

    }

    public int getSeatColumn() {
        return seatColumn;
    }

    public int getRow() {
        return row;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}