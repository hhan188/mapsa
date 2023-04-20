package com.tamrin7;

public class Course
{
    private String name;
    private Student [] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int calcAVGGrade (Student s)
    {
        int sum = 0;
        for (int i = 0; i < s.getGrades().length; i++)
        {
            sum += s.getGrades()[i];
        }

        return sum / s.getGrades().length;
    }
}
