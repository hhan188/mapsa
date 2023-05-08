package SoheylSayyah.Practice10.Exercise39;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Mitsubishi's Engine is Starting");
    }
    public void accelerate(){
        System.out.println("Mitsubishi is Accelerating");
    }
    public void brake(){
        System.out.println("The Mitsubishi is Braking");
    }
}
