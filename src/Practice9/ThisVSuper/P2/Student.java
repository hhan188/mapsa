package Practice9.ThisVSuper.P2;

public class Student extends Person{
    String major;
    public Student(String name, int age, String gender, String major) {
        super(name, age, gender);
        this.major = major;
    }
}
