package SoheylSayyah.Practice10.Exercise39;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();
        Mitsubishi mitsubishi = new Mitsubishi(6,"Out Lander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        Ford ford = new Ford(6,"Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        Holden holden = new Holden(6,"Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}
