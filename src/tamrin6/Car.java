package tamrin6;

//Problem 4 & 11 solution
public class Car {
    private String make;
    private String model;
    private short year;

    public Car(String make, String model, short year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.trim().toLowerCase();
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Car Details:");
        System.out.println("make: " + getMake() + "model: " + getModel() + "year: " + getYear());
    }

    public boolean isSameCar(Car anotherCar) {
        return make.equals(anotherCar.getMake()) && model.equals(anotherCar.getModel()) && year == anotherCar.getYear();
    }

    public String compareCar(Car anotherCar) {
        if (model.equals(anotherCar.getModel()))
            if (year == anotherCar.year)
                return "same model";
            else if (year > anotherCar.year)
                return "newer model";
            else
                return "older model";
        return "Not the same model";
    }
}
