package SoheylSayyah.Practice9.ThisAndSuper.Exercise2;

public class Student extends Person{
    private String major;

    public Student(String name, int age, String gender, String major) {
        super(name, age, gender);
        this.major = major;
    }
}
