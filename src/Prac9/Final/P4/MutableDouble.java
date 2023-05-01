package Prac9.Final.P4;

public class MutableDouble {
    private double value;

    MutableDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
