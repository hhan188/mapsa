package SoheylSayyah.Practice10.Exercise39;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Ford's Engine is Starting");
    }
    public void accelerate(){
        System.out.println("Ford is Accelerating");
    }
    public void brake(){
        System.out.println("The Ford is Braking");
    }
}
