package Practice7.Vehicle;

import javax.swing.plaf.PanelUI;

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
    public void startEngin(){
        System.out.println("enginStarted");
    }
}
