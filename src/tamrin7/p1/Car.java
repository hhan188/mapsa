package tamrin7.p1;

//Problem 1
public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void startEngine(){
        System.out.println("Car engine started");
    }

}
