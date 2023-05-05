package tamrin9.interfaces.p1;

public class Car implements Sortable<Car>{

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean compare(Car other) {
        return year < other.getYear();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
