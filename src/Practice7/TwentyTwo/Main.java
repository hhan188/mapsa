package Practice7.TwentyTwo;

import static java.util.Objects.isNull;

public class Main {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        cars[0]=new Car("206","Ikca");
        cars[1]=new Car("405","Ikca");
        cars[3]=new Car("c200","benz");
        Car[] searched=Check(cars,"Ikca");
        for (Car car:searched) {
            if (!isNull(car)){
                System.out.println(car.getName());
            }
        }
    }

    private static Car[] Check(Car[] cars, String make) {
        Car[] temp = new Car[cars.length];
        int j = 0;
        for (Car car:cars) {
            if (car.getMake().equalsIgnoreCase(make)){
                temp[j]=car;
                j++;
            }
        }
        return temp;
    }
}
