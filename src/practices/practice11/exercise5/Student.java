package practices.practice11.exercise5;

import com.google.gson.Gson;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) throws GradeOutOfRangeException {
        this.name = name;
        if (average<=0||average>=100)
            throw new GradeOutOfRangeException();
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public double getAverage() {
        return average;
    }

    public Student setAverage(double average) {
        this.average = average;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
