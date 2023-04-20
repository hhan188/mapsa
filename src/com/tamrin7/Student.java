package com.tamrin7;

public class Student
{
    private String name;
    private int age;
    private int [] grades;

    private int GPA;

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int [] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int avg (int [] grades)
    {
        int sum = 0;
        for(int item : grades)
        {
            sum += item;
        }
        return sum / grades.length;
    }
}
