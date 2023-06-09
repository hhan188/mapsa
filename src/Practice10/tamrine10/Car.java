package Practice10.tamrine10;

public class Car {
    private boolean engin=true;
    private int cylinders;
    private String name;
    private int wheels=4;

    public Car(int cylinders,  String name) {
        this.cylinders=cylinders;
        this.name = name;
    }
    public void startEngine(){
        System.out.println("the car's engine is starting...");
    }
    public void accelerate(){
        System.out.println("the car is accelerating...");
    }
    public void brake(){
        System.out.println("the car is braking...");
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
