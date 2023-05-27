package practices.practice12;

import com.google.gson.Gson;

public class Seat {

    private Integer availability;
    private Integer row;
    private Boolean available;

    public Seat() {
    }

    public Seat(Integer availability, Integer row, Boolean available) {
        this.availability = availability;
        this.row = row;
        this.available = available;
    }

    public Integer getAvailability() {
        return availability;
    }

    public Seat setAvailability(Integer availability) {
        this.availability = availability;
        return this;
    }

    public Integer getRow() {
        return row;
    }

    public Seat setRow(Integer row) {
        this.row = row;
        return this;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Seat setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
