package Tamrin7;

public class car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}
