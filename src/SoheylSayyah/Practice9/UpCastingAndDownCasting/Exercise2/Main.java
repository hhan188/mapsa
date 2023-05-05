package SoheylSayyah.Practice9.UpCastingAndDownCasting.Exercise2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Teacher();
        Person person2 = new Student();
        person1.introduce();
        person2.introduce();
        Person student = (Person) new Student();
        student.introduce();
        Person teacher = (Person) new Teacher();
        teacher.introduce();
    }
}
