package Practice11.five;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student=new Student();

        try {
            student.addGrade(50);
        } catch (GradeOutOfRangeException e) {
            throw new RuntimeException(e);
        }
        try {
            student.addGrade(80);
        } catch (GradeOutOfRangeException e) {
            throw new RuntimeException(e);
        }

        try {
            student.calcAvg();
        } catch (GradeOutOfRangeException e) {
            throw new RuntimeException(e);
        }
    }
}
