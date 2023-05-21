package Practice7.Student;

public class Student {
    private String name;
    private  int age;
    protected int[] grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

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

    private void displaygrade() {
        for (int i = 0; i < this.grades.length; i++) {
            System.out.println(this.grades[i]);
        }
    }



}
