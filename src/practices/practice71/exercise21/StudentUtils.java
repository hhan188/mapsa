package practices.practice71.exercise21;

import practices.practice71.exercise15.Student;

public class StudentUtils {

    public Student maxGrade(Student[] students) {
        int max = 0;
        Student student = new Student();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverage() > max) {
                student = students[i];
            }
        }
        return student;
    }

}
