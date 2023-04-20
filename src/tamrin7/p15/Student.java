package tamrin7.p15;

public class Student {
    private String name;
    private int age;
    private int[] grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
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

    public double calculateAvg(){
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double avg = sum/grades.length;
        return avg;
    }


}
