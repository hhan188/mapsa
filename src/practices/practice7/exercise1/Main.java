package practices.practice7.exercise1;

import practices.practice7.exercise22.CarUtils;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMaxSpeed(120);
        car.setNumberOfDoors(5);
        System.out.println("the car's max speed is: "+car.getMaxSpeed());
        System.out.println("the car's number of doors is: "+car.getNumberOfDoors());
        car.startEngine();





    }
}
