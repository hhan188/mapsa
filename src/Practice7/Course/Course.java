package Practice7.Course;

import java.util.Arrays;

public class Course {
    private String name;
    private Studentt[] students;
    private double courseAvg;

    public Course() {
    }

    public Course(String name, Studentt[] students) {
        this.name = name;
        this.students = students;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studentt[] getStudents() {
        return students;
    }

    public void setStudents(Studentt[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        CourseUtils courseUtils=new CourseUtils();
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", courseAvg=" + courseUtils.courseAvg(students,name) +
                '}';
    }
}
