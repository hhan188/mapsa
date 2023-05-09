package Prac11.P7;

public class Seat {
    private boolean isBooked;
    private int number;

    public Seat(boolean isBooked, int number) {
        this.isBooked = isBooked;
        this.number = number;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getNumber() {
        return number;
    }

    public void toggleBooked() {
        isBooked = !isBooked;
    }
}
