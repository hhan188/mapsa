package Practice7.one;

public class Car extends Vehicle{
    private int numberOfDoors;

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    //add create an instance of Car and call the startEngine method to verify that it prints "Car engine started"
}
