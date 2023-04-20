package SoheylSayyah.Practice7.Exercise17;

public class Course {
    private String name;
    private Student[] student;

    public Course(String name, Student[] student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
}
