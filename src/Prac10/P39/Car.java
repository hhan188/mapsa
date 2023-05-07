package Prac10.P39;

public class Car {
    private boolean engine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels = 4;
        engine = true;
    }

    public void startEngine() {
        System.out.println("Car -> engine is starting.");
    }

    public void accelerate() {
        System.out.println("Car -> dare gaz mide");
    }

    public void brake() {
        System.out.println("Car -> mashin dare tormoz mikone");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
