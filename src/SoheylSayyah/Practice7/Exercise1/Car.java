package SoheylSayyah.Practice7.Exercise1;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int maxSpeed, int numberOfDoors) {
        super(maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public void startEngine(){
        System.out.println("Car Engine Started");
    }
}
