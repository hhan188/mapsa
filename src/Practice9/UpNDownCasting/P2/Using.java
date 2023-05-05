package Practice9.UpNDownCasting.P2;

public class Using {
    public static void main(String[] args) {
        Person person = new Person();
        Person teacher = new Teacher();
        Student student = new Student();

        person.introduce();
        teacher.introduce();
        student.introduce();

    }
}
