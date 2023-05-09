package Prac11.P11;

public class Seat {
    private boolean isBooked;
    private int number;

    public Seat(int number) {
        this.isBooked = false;
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
