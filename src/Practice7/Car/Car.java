package Practice7.Car;

import Practice7.Vehicle.Vehicle;

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
    public void startEngin(){
        System.out.println("CarEnginStarted");
    }
}
