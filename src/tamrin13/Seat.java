package tamrin13;

public class Seat {
    private int number;
    private int row;
    private int column;

    private boolean availability;

    public Seat(int number, int row, int column, boolean availability) {
        this.number = number;
        this.row = row;
        this.column = column;
        this.availability = availability;
    }

    //Getters & Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
