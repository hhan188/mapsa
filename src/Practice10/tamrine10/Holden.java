package Practice10.tamrine10;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("the Holden's engine is starting...");

    }

    @Override
    public void accelerate() {
        System.out.println("the Holden is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("the Holden is braking...");
    }
}
