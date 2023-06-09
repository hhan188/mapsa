package Practice10.tamrine10;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("the Ford's engine is starting...");

    }

    @Override
    public void accelerate() {
        System.out.println("the Ford is accelerating...");

    }

    @Override
    public void brake() {
        System.out.println("the Ford is braking...");

    }
}
