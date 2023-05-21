package Practice10.Ten;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }
    public void startEngine(){
        System.out.println("Cars Engin is Start");

    }
    public void accelerate(){
        System.out.println("Car gaz verma");
    }
    public void barke(){
        System.out.println("Car is brake");
    }
}
