package Prac7;
/**
 * Arrays Practice Series 2 - Soale 5
 * Create a class called Student that has private fields for name, age, and grades (an array of integers).
 * Include getter and setter methods for name and age, and a method to calculate the average grade.
 * Create an array of 4 Student objects and print out the name, age, and average grade of each student.
 */
public class Student {
    private String name;
    private int age;
    private int[] grades;

    Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    public int calculateAvgGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
