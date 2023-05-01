package Prac9.UpCastingAndDownCasting.P2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        Person person1 = (Person) student;
        Person person2 = (Person) teacher;
        person1.introduce();
        person2.introduce();

        Teacher teacher1 = (Teacher) person2;
        teacher1.introduce();
    }
}
