package practices.practice7.exercise22;

import practices.practice7.exercise1.Car;

import java.util.Arrays;

import static practices.practice7.exercise22.CarBrands.Ford;
import static practices.practice7.exercise22.CarBrands.Mercedes;

public class Main {
    public static void main(String[] args) {

        //Exercise 22
        CarUtils utils = new CarUtils();
        Car ford = new Car(300, 4, Ford);
        Car toyota = new Car(180, 5, CarBrands.Toyota);
        Car ford1 = new Car(250, 2, Ford);
        Car bmw = new Car(360, 4, CarBrands.BMW);
        Car mercedes = new Car(220, 2, CarBrands.Mercedes);
        Car[] cars = {ford, toyota, ford1, bmw, mercedes};
        System.out.println(Arrays.toString(cars));
        System.out.println("****************Exercise 22*******************");

        System.out.println(Arrays.toString(utils.sameBrandsArray(cars, Ford)));
        System.out.println(Arrays.toString(utils.sameBrandsArray(cars, Mercedes)));
        System.out.println(Arrays.toString(utils.sameBrandsArray(cars, null)));

    }
}
