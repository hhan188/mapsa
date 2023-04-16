package tamrin6.P11;

import tamrin6.P4.Car;

public class Mashin {
    private String make;
    private String model;
    private int year;

    public Mashin(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public boolean isSameMashin(Mashin otherCar) {
        return this.make.equals(otherCar.make) &&
                this.model.equals(otherCar.model) &&
                this.year == otherCar.year;
    }

}
