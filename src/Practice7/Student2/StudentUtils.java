package Practice7.Student2;

public class StudentUtils {

    public Student getMaxAvg(Student[] students) {
        int max = 0;
        Student student = new Student();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa();
                student = students[i];
            }
        }
        return student;
    }


}
