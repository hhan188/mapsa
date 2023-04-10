package sajjadEmami.Prac6;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printDetails() {
        System.out.println("make : " + make);
        System.out.println("model : " + model);
        System.out.println("year : " + year);
    }
}
