package practices.practice7.exercise17;

import practices.practice7.exercise15.Student;

import java.util.Arrays;

public class Course {
    private String name;
    private Student[] students;

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

    public double courseGrade(Student student) {
        if (getName().equals("Math"))
            return student.getGrades()[0];
        return student.getGrades()[1];
    }

    public double courseGradeAverage(Student[] students) {
        double[] arr = new double[students.length];
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            arr[i] = courseGrade(students[i]);
            sum += courseGrade(students[i]);
        }
        return (double) sum / students.length;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                " course average=" + courseGradeAverage(students) +
                '}';
    }
}
