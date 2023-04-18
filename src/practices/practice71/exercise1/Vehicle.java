package practices.practice71.exercise1;

public class Vehicle {
    private double maxSpeed;

    public Vehicle() {
    }

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
