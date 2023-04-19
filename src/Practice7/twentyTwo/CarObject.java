package Practice7.twentyTwo;

import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car[] cars = {new Car("Saipa"), new Car("Iran Khodro"), new Car("Saipa"), new Car("Saipa")};

    }
    public static Car[] carsWithSpecifiedMake(Car[] cars){
        Car[] sameCars = new Car[4];
        for (int i = 0;i<4;i++){
            if (cars[i].getMake().equals("Saipa")) {
                System.out.println("cars[" + i + "]" + " make by Saipa");
                sameCars[i] = cars[i];
            }
        }
        return sameCars;
    }

}
