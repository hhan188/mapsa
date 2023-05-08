package SoheylSayyah.Practice10.Exercise39;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Holden's Engine is Starting");
    }
    public void accelerate(){
        System.out.println("Holden is Accelerating");
    }
    public void brake(){
        System.out.println("The Holden is Braking");
    }
}
