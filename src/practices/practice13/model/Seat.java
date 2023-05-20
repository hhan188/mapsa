package practices.practice13.model;

import com.google.gson.Gson;

public class Seat {

    private Integer seatNumber;
    private Integer row;
    private Integer column;
    private Boolean availability;

    public Seat() {
    }

    public Seat(Integer seatNumber, Integer row, Integer column, Boolean availability) {
        this.seatNumber = seatNumber;
        this.row = row;
        this.column = column;
        this.availability = availability;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
