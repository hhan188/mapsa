package SoheylSayyah.Practice7.Exercise22;

import static java.util.Objects.isNull;

public class UsingCar {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("405","IKCO");
        cars[1] = new Car("206","IKCO");
        cars[2] = new Car("Pride","Saipa");
        Car[] searched = check(cars, "IKCO");
        for (Car car : searched)
            if (!isNull(car)) {
                System.out.println(car.getName());
            }
    }
    public static Car[] check(Car[] cars, String make){
        Car[] temp = new Car[cars.length];
        int j = 0;
        for (Car car : cars) {
            if (car.getMake().equals(make)) {
                temp[j] = car;
                j++;
            }
        }
        return temp;
    }
}
