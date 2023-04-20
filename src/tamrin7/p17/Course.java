package tamrin7.p17;

public class Course {
    private String name;
    private Student[] students;
    private double[] grades;

    public Course(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

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

    public double calculateAvgCourse() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double avgAll = sum / grades.length;
        return avgAll;
    }
}
