package Practice7.fifteen;

public class Student {
    private String name;
    private int age;
    private int[] grades = new int[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int gradeAv(int[] grades) {
        int av = 0;
        for (int i = 0; i < 5; i++)
            av += grades[i];
        return av / 5;
    }

    public void setRadius(int i) {
    }
}
