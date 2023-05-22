package practices.practice14.exercise17;

import com.google.gson.Gson;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public Car setEngine(boolean engine) {
        this.engine = engine;
        return this;
    }

    public int getCylinders() {
        return cylinders;
    }

    public Car setCylinders(int cylinders) {
        this.cylinders = cylinders;
        return this;
    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public int getWheels() {
        return wheels;
    }

    public Car setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public String startEngine() {
        return getName() + " engine is starting with "+getCylinders()+" Cylinders";
    }

    public String accelerate() {
        return getName() + " is accelerating with "+getCylinders()+" Cylinders";
    }
    public String brake(){
        return getName() + " is braking with "+getCylinders()+" Cylinders";
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
