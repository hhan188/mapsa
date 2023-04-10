package sajjadEmami.Prac6;

public class Car2 {
    private String make;
    private String model;
    private int year;

    public Car2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public boolean isSameCar(Car2 anotherCar) {
        return make.equals(anotherCar.make) &&
                model.equals(anotherCar.model) &&
                year == anotherCar.year;
    }
}
