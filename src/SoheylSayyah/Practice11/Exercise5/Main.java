package SoheylSayyah.Practice11.Exercise5;

public class Main {
    public static void main(String[] args) {
        double[] grades = {25,60,75,110};
        try {
            Student student = new Student(grades);
            System.out.println(student.average());
        } catch (GradeOutOfRangeException e) {
            System.err.println(e.getMessage());
        }
    }
}
