package Prac10.P39;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(10, "car");
        Mitsubishi mitsubishi = new Mitsubishi(25, "mitsubishi");
        car.startEngine();
        car.accelerate();
        car.brake();
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
    }
}
