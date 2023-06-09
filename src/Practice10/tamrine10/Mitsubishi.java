package Practice10.tamrine10;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("the Mitsubishi's engine is starting...");

    }

    @Override
    public void accelerate() {
        System.out.println("the Mitsubishi is accelerating...");

    }

    @Override
    public void brake() {
        System.out.println("the Mitsubishi is braking...");

    }


}
