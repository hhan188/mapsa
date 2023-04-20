package SoheylSayyah.Practice7.Exercise1;

public class Vehicle {
    private int maxSpeed;
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void startEngine(){
        System.out.println("Engine Started");
    }
}
