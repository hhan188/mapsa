package Practice7.seventeen;

public class Course {
    private String name;
    private int[] students = new int[3];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getStudents() {
        return students;
    }

    public void setStudents(int[] students) {
        this.students = students;
    }

    public int getAv() {
        int av = 0;
        for (int i = 0; i < 3; i++) {
            av += students[i];
        }
        return av/3;
    }
}
