package Prac7;

/**
 * Arrays Practice Series 2 - Soale 10
 * Create a class called Course that has private fields for name and students (an array of Student objects).
 * Include getter and setter methods for the name and students, and a method to calculate the average grade of all the students in the course.
 * Create an array of 2 Course objects, each with 3 students, and print out the name of each course and the average grade of all the students in the course.
 */
public class Course {
    private String name;
    private Student[] students;

    Course(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int courseAvgGrade() {
        int sum = 0;
        for (Student student : students) {
            sum += student.calculateAvgGrade();
        }
        return sum / students.length;
    }
}
