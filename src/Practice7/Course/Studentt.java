package Practice7.Course;

import java.util.Arrays;

public class Studentt {
    private String name;
    private int[] grade;

    public Studentt() {
    }

    public Studentt(String name, int[] grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", grade=" + Arrays.toString(grade) +
                '}';
    }
}
