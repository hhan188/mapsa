package practices.practice71.exercise15;

public class Student {
    //private fields for name, age, and grades
    private String name;
    private int age;
    private int[] grades;
    private Student[] students;

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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double getAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / (grades.length);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age + ", " +
                " avg=" + this.getAverage() +
                '}';
    }
}
