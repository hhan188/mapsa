package Prac9.Interface.P1;

public class Car implements Sortable{
    private int year;

    private String model;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getSortableProp() {
        return year;
    }

    @Override
    public int compare(Sortable object) {
        Car car = (Car) object;
        if (year > car.getYear())
            return 1;
        else if (year < car.getYear())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return model + " : \n" + "year => " + year;
    }
}
