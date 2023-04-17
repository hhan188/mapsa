package Prac7;

/**
 * Arrays Practice Series 2 - Soale 8
 * Create a class called Circle that has a private field for radius.
 * Include getter and setter methods for the radius,
 * and a method to calculate the circumference of the circle.
 * Create an array of 9 Circle objects and print out the radius and circumference of each circle.
 */
public class Circle {
    private double radius;
    private double PI;
    Circle(double radius) {
        this.radius = radius;
        this.PI = Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}
