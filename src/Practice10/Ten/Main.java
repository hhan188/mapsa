package Practice10.Ten;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8,"Base car");
        car.startEngine();
        car.accelerate();
        car.barke();
        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander vrx");
        mitsubishi.accelerate();
        mitsubishi.barke();
        mitsubishi.startEngine();
    }
}
