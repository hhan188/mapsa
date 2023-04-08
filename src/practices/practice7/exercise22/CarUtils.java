package practices.practice7.exercise22;

import practices.practice7.exercise1.Car;

public class CarUtils {
    public Car[] sameBrandsArray(Car[] cars, CarBrands brands) {
        int length = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrands().equals(brands)) {
                length++;
            }
        }
        Car[] cars1 = new Car[length];
        int index = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrands().equals(brands)) {
                cars1[index++] = cars[i];
            }
        }
        return cars1;
    }
}
