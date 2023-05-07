package Prac10.P39;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " -> mashin dare gaz mikhore");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " -> mashin dare tormoz mikone");
    }
}
